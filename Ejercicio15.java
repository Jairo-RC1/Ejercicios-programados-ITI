import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("Ingrese un numero ( escriba un 0 para terminar)");
            num = input.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("La suma de los numeros es: " + sum);

    }
}
