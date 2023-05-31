import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double mill;
        Double kilo;

        do {
            System.out.println("Ingrese las millas ( digite 0 para salir)");
            mill = input.nextDouble();

            kilo = mill * 1.6093;

            System.out.println("Las " + mill + " millas serian " + kilo + " kilometros ");

        } while (mill != 0);
        System.out.println("Saliendo del programa...");
    }
}
