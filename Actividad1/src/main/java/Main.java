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
                    String nombre = "";
                    do {
                        nombre = sc.nextLine();
                    } while (nombre.matches(""));
                    System.out.print("Introduce edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Introduce nota media: ");
                    double nota = sc.nextDouble();
                    System.out.print("¿Está matriculado? (true/false): ");
                    boolean matriculado = sc.nextBoolean();
                    System.out.println();
                    estudiantes.add(new Estudiante(nombre, edad, nota, matriculado));
                    System.out.println("Estudiante añadido correctamente. \n");
                    break;
                }
                case 2 -> {
                    System.out.println("Lista de estudiantes: ");
                    for (Estudiante estudiante : estudiantes) {
                        System.out.println(estudiante.toString());
                    }
                    System.out.println();
                    break;
                }
                case 3 -> {
                    System.out.print("Introduce nombre del estudiante a buscar: ");
                    String nombre = "";
                    do {
                        nombre = sc.nextLine();
                    } while (nombre.matches(""));
                    boolean encontrado = true;
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombre().matches(nombre)) {
                            encontrado = true;
                            System.out.println("\nAquí están los datos del estudiante:");
                            System.out.println(estudiante.toString());
                            break;
                        } else encontrado = false;
                    }
                    if (estudiantes.isEmpty()) {
                        encontrado = false;
                    }
                    if (!encontrado) {
                        System.out.println("\nNo se ha encontrado ningún estudiante con ese nombre.");
                    }
                    System.out.println();
                    break;
                }
                case 4 -> {
                    double media = 0;
                    for (int i = 0; i < estudiantes.size(); i++) {
                        media += estudiantes.get(i).getNota();
                    }
                    media /= estudiantes.size();
                    System.out.println("\nAquí está la media de las notas de todos los estudiantes: " + media);
                    System.out.println();
                    break;
                }
                case 5 -> {
                    double nota = 0;
                    int estudiante = 0;
                    for (int i = 0; i < estudiantes.size(); i++) {
                        if (estudiantes.get(i).getNota() > nota) {
                            nota = estudiantes.get(i).getNota();
                            estudiante = i;
                        }
                    }
                    System.out.println("\nEste es el estudiante con la mejor nota:\n" + estudiantes.get(estudiante).toString());
                    System.out.println();
                    break;
                }
                case 6 -> salir = true;
                default -> System.out.println("Opción no válida. Inténtalo de nuevo");
            }

        } while (!salir);

        System.out.println("Saliendo del programa...");
    }
}
