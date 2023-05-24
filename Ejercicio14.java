import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num=1;

        while (num != 0) {
            System.out.println("Ingrese un numero");
            num = input.nextInt();

            if (num > 0) {
                System.out.println("El numero es positivo");
            } else if (num < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es 0");
            }

        }
    }
}
