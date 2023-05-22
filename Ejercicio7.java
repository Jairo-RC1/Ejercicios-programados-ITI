import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        if (num <0 ){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
    }
}
