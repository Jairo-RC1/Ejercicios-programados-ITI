import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sueldo;

        System.out.println("Ingrese una n cantidad de sueldos");
        sueldo = input.nextInt();

        while (sueldo <= 0) {
            System.out.println("La cantidad de sueldos debe ser mayor a 0");
            System.out.println("Ingrese nuevamente la cantidad de sueldos");
            sueldo = input.nextInt();
        }

        double sueldoMaximo = Double.MIN_VALUE;

        for (int i = 0; i < sueldo; i++) {
            System.out.println("Ingrese el sueldo");
            double sueldo1 = input.nextDouble();

            if (sueldo1 > sueldoMaximo) {
                sueldoMaximo = sueldo1;
            }
        }
        System.out.println("El sueldo maximo es: " + sueldoMaximo);

    }
}
