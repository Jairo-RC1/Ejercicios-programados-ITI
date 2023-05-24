
import java.util.Scanner;

public class Ejerciciotres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio 'r' ");
        int radio = input.nextInt();

        double area = (3.14) * Math.pow(radio, 2);
        double perim = 2 * (3.14) * radio;

        System.out.println("El resultado es del area es: " + area);
        System.out.println("El resultado es del perimetro es: " + perim);

    }
}
