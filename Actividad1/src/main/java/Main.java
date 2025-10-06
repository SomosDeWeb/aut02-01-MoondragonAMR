import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        do {
            System.out.println("""
                    === Gestor de estudiantes ===
                    1. Añadir estudiante
                    2. Listar estudiantes
                    3. Buscar por nombre
                    4. Calcular nota media general
                    5. Mostrar mejor estudiante
                    6. Salir""");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Introduce nota media: ");
                    double nota = sc.nextDouble();
                    System.out.print("¿Está matriculado? (true/false): ");
                    boolean matriculado = sc.nextBoolean();
                    estudiantes.add(new Estudiante(nombre, edad, nota, matriculado));
                    System.out.println("Estudiante añadido correctamente. \n");
                    break;
                }
                case 2 -> {
                    
                    break;
                }
                case 3 -> {

                    break;
                }
                case 4 -> {

                    break;
                }
                case 5 -> {

                    break;
                }
                case 6 -> salir = true;
                default -> System.out.println("Opción no válida. Inténtalo de nuevo");
            }

        } while (!salir);

        System.out.println("Saliendo del programa...");
    }
}
