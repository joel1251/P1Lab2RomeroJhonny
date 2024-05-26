package Biblioteca;

import java.util.Scanner;

public class MainP1Lab2RomeroJhonny {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("Bienvenido a la Librearia Jhonny Romero presiona enter para ingresar");
        //Validacion para ingresar el sistema 
        while (true) {
            String entrar = scanner.nextLine();
            if (entrar.isEmpty()) {
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, presiona Enter para ingresar.");
            }
        }
        
       
        do {
            System.out.println("Universidad de las Fuerzas Armadas Espe");
            System.out.println("--Programación Orientada a Objetos");
            System.out.println("Nombre: Jhonny Joel Romero Lopez");
            System.out.println("------------------Lab2---------");
            System.out.println("Fecha: 26-05-2024");
            System.out.println("---------------Menú--------");
            System.out.println("1 - Consultar Libro");
            System.out.println("2 - Pedir Libro");
            System.out.println("3 - Devolver Libro");
            System.out.println("4 - Salir");
            System.out.print("Selecciona una opción: ");
            //Validacion para ingresar enteros
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); // Descarta la entrada no válida
                System.out.print("Selecciona una opción: ");
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	consultarLibro();
                    break;
                case 2:
                	pedirLibro();
                    break;
                case 3:
                	devolverLibro();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
    
    public static void consultarLibro () {
    	
    }
    public static void pedirLibro () {}
    public static void devolverLibro () {}
    
}
