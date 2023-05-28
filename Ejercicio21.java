import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        while (num <= 0) {
            System.out.println("Ingrese un numero mayor a 0");
            num = input.nextInt();
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El numero " + num + " si es multiplo de 3 y de 5");
        } else {
            System.out.println("El numero " + num + " no es multiplo de 3 y de 5");
        }
    }
}
