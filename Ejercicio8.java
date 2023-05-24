import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int num = input.nextInt();

        while (num == 0) {
            System.out.println("Escriba un numero diferente a 0");
            num = input.nextInt();
        }

        System.out.println("Ingrese un segundo numero");
        int num2 = input.nextInt();

        while (num2 == 0) {
            System.out.println("Escriba un numero diferente a 0");
            num2 = input.nextInt();
        }

        if (num / num2 == 0) {
            System.out.println(num + " es múltiplo de " + num2);
        } else if (num2 / num == 0) {
            System.out.println(num2 + " es múltiplo de " + num);
        } else {
            System.out.println("Los números no son múltiplos entre sí.");
        }
    }
}
