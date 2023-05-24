import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de día de nacimiento");
        int n1 = input.nextInt();
        while (n1 <= 0 || n1 > 30) {
            System.out.println("Ingrese el numero de día de fecha de nacimiento correcto");
            n1 = input.nextInt();
        }

        System.out.println("Ingrese el numero de mes de nacimiento");
        int n2 = input.nextInt();
        while (n2 <= 0 || n2 > 12) {
            System.out.println("Ingrese el numero de mes de nacimiento correcto");
            n2 = input.nextInt();
        }

        System.out.println("Ingrese el numero de año de nacimiento");
        int n3 = input.nextInt();
        while (n3 <= 0) {
            System.out.println("Ingrese el numero de año de nacimiento correcto");
            n3 = input.nextInt();
        }
        System.out.println("La fecha de nacimiento es el dia " + n1 + " del mes " + n2 + " y del año " + n3);
    }
}
