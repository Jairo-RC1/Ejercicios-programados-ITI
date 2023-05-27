import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[10];
        boolean negativo = false;

        System.out.println("Ingrese 10 numeros");

        for (int i=0; i<10; i++){
            System.out.println("Numero"+ (i+1) +": ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] < 0) {
                negativo = true;
                break;
            }
        }

        if (negativo) {
            System.out.println("Se ha introducido un numero negativo");
        } else {
            System.out.println("No se introdujo ningun numero negativo");
        }
    }
}
