import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 0 y 9999");
        int num = input.nextInt();

        while (num < 0 || num > 9999) {
            System.out.println("Ingrese un numero entre 0 y 9999");

            num = input.nextInt();
        }
        if (num < 10) {
            System.out.println("El numero tiene 1 cifra");
        } else if (num < 100) {
            System.out.println("El numero tiene 2 cifras");
        } else if (num < 1000) {
            System.out.println("El numero tiene 3 cifras");
        } else if (num < 9999) {
            System.out.println("El numero tiene 4 cifras");
        }
    }
}
