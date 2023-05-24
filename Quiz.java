import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de filas: ");
        int filas = input.nextInt();

        System.out.println("Ingrese el número de columnas: ");
        int columnas = input.nextInt();

        System.out.println("Ingrese el nombre a llenar ");
        String nombreString;

        char[][] matriz = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = input.nextChar();
            }
        }
        System.out.println("El nombre ingresado es: ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = input.nextChar();
            }
        }
    }
}
