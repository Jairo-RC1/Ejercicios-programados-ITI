import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;

        while (n < 0) {
            System.out.println("Ingrese un numero");
            n = input.nextInt();
            Double pot = Math.pow(n, 2);

            System.out.println("El resultado de la potencia es: " + pot);

        }

    }
}
