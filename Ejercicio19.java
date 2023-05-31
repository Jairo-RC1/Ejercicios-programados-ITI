import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un primer numero");
        int num = input.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 = input.nextInt();

        if (num == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }
    }
}
