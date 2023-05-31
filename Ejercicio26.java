import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese un numero(digite un numero negativo para salir)");

        while (true) {

            int numero = input.nextInt();
            contador++;

            if (numero < 0) {
                
                contador--;

                break;
            }

            System.out.println("El total de numeros ingresados son de: " + contador);
        }
    }
}
