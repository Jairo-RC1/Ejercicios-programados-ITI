import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        while (num <= 0) {
            System.out.println("Ingrese un numero mayor a 0");
            num = input.nextInt();
        }

        Double pot2 = Math.pow(num, 2);
        Double pot3 = Math.pow(num, 3);

        System.out.println("El doble del numero " + num + " es " + pot2 + " y el triple es " + pot3);

    }
}
