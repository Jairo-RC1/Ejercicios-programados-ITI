import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        while (num==0){
            System.out.println("Escriba un numero diferente a 0");
            num = input.nextInt();
        }

        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();


    }

}
