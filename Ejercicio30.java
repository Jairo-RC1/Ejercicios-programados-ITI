import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSalarios = 10;
        int sumaSalarios = 0;
        int salarioMayor = 0;

        for (int i = 1; i <= totalSalarios; i++) {
            System.out.print("Ingrese el salario #" + i + ": ");
            int salario = scanner.nextInt();
            sumaSalarios += salario;

            if (salario > 10000) {
                salarioMayor++;
            }
        }

        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("Hay " + salarioMayor + " salarios mayores a 10000 colones.");
    }
}
