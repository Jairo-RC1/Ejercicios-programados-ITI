import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para multiplicar");
        int num = input.nextInt();

        while (num <= 0) {
            System.out.println("Ingrese un numero positivo");
            num = input.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println("El resultado de la multiplicacion es: " + mult);
        }
    }
}
