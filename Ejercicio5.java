import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        double num = input.nextInt();
        double factorial = 1;

        while (num !=0){
            factorial=factorial*num; num--;
        }
        System.out.println(factorial);
    }
}
