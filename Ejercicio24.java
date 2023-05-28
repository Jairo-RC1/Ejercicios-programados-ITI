import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese lo segundos de la hora");
        int seg = input.nextInt();

        while (seg < 0 || seg > 60) {
            System.out.println("El numero ingresado es incorrecto, intentelo nuevamente");
            seg = input.nextInt();
        }

        System.out.println("Ingrese los minutos");
        int min = input.nextInt();

        while (min < 0 || min > 60) {
            System.out.println("El numero ingresado es incorrecto, intentelo nuevamente");
            min = input.nextInt();
        }

        System.out.println("Ingrese la hora (formato de 24 horas)");
        int hora = input.nextInt();

        while (hora < 0 || hora > 24) {
            System.out.println("El numero ingresado es incorrecto, intentelo nuevamente");
            hora = input.nextInt();
        }

        System.out.println(
                "La hora digitada es la siguiente: " + hora + " horas con " + min + " minutos y " + seg + " segundos ");
    }
}
