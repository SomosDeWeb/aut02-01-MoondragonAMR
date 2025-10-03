import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;

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

            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {
                salir = true;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo");
            }

        } while (!salir);

        System.out.println("Saliendo del programa...");
    }
}
