import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un primer numero");
        int num = input.nextInt();

        while (num==0){
            System.out.println("Escriba un numero diferente a 0");
            num = input.nextInt();
        }

        System.out.println("Ingrese un segundo numero");
        int num2 = input.nextInt();

        while (num2==0){
            System.out.println("Escriba un numero diferente a 0");
            num2 = input.nextInt();
        }

        if (num > num2){
            System.out.println(num + " es mayor a "+ num2);
        } else {
            System.out.println(num2 + " es mayor a "+ num);
        }
    }
}
