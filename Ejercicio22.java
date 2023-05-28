import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un año");
        int año = input.nextInt();

        while (año <= 0) {
            System.out.println("Ingrese un año que sea valido");
            año = input.nextInt();
        }

        if (año % 4 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
}
