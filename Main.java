// Juan Jose Ospina Arroyave
// Marco Isaac Montes Meza
// Juan José Molina
// Andrey Murillo Osorio

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar nombre
            System.out.print("Introduce el nombre del cliente (o escribe 'salir' para cerrar el programa): ");
            String nombre = scanner.nextLine();

            // Salir del bucle si el usuario escribe "salir"
            if (nombre.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Solicitar edad
            System.out.print("Introduce la edad del cliente en numeros: ");
            while (!scanner.hasNextInt()) { // Validar que la entrada sea un número
                System.out.println("Por favor, introduce un número válido.");
                scanner.next(); // Descartar la entrada inválida
            }
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

        // Condiciones
        if (edad >= 200) {
            System.out.println("Es un vampiro porque cumple con la edad de los vampiros 200 o mayor a 200, deberias remitirlo a otra sala");
        }else if (edad >= 100 && edad < 200 && nombre.startsWith("H")){
            System.out.println("Puedes ser un hombre lobo muy longevo porque cumple con la de edad (mayor a 100 años y menor a 200) y su nombre inicia con H. Deberias remitirlo a otra sala");
        
        
        } else if (edad >= 100 && edad < 200) {
            System.out.println("Puedes ser un hombre lobo muy longevo porque cumple con el criterio de edad (mayor a 100 años y menor a 200). Deberias remitirlo a otra sala");
       
       
        }
        else if (nombre.startsWith("H")) {
            System.out.println("Puedes ser un hombre lobo porque su nombre inice por H. Deberias remitirlo a otra sala");
        }
        else {
            System.out.println("Tiene altas probabilidades de ser un humano.");
        }

    }

    }
}