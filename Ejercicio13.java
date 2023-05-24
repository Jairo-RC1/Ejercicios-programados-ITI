import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para hacer su potencia");
        int n = input.nextInt();


        double pot = Math.pow(n, 2);

        System.out.println("El resultado de la potencia es: " + pot);

    }
}
