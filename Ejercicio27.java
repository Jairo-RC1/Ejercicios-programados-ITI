import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. Adivina cuál es.");
        
        int numeroUsuario;
        do {
            System.out.print("Introduce tu número: ");
            numeroUsuario = input.nextInt();
            
            intentos++;
            
            if (numeroUsuario > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
            }
        } while (numeroUsuario != numeroAdivinar);

    }
}
