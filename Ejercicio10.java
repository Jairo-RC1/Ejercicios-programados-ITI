import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un primer numero");
        int num = input.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 = input.nextInt();

        while (num2 == 0) {
            System.out.println("Escriba un numero diferente a 0");
            num2 = input.nextInt();
        }

        System.out.println("Ingrese un tercer numero");
        int num3 = input.nextInt();

        while (num3 == 0) {
            System.out.println("Escriba un numero diferente a 0");
            num3 = input.nextInt();
        }

        if (num > num2 && num > num3) {
            System.out.println("El mayor es: " + num);
        } else if (num2 > num && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
