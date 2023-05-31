import java.util.Scanner;

public class Ejercicio25 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println("Ingrese un numero ( digite 0 para salir)");
            num = input.nextInt();

            while( num < 0){
                System.out.println("Ingrese un numero correctamente");
                num = input.nextInt();
            }

            double pot = Math.pow(num, 2);

            System.out.println("El resultado de la potencia de "+ num + " es: "+ pot);
        } while (num != 0);
    }
}
