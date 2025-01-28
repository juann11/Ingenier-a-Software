import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Condiciones
        if (edad >= 200) {
            System.out.println("Eres un vampiro.");
        } else if (edad >= 120 && edad < 200 && nombre.startsWith("H")) {
            System.out.println("Eres un hombre lobo.");
        } else if (edad < 120) {
            System.out.println("Eres un humano.");
        } else {
            System.out.println("Datos no válidos.");
        }

        scanner.close();
    }
}
