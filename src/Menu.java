import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Producto> inventario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;

        System.out.println("¡Bienvenido al Sistema de Inventario!");

        do {
            System.out.println("\n---- Menú de Inventario ----");
            System.out.println("1. Agregar Alimento");
            System.out.println("2. Agregar Tecnología");
            System.out.println("3. Agregar Electrodoméstico");
            System.out.println("4. Mostrar Inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el búfer del scanner
                opcion = -1; // Establecer una opción no válida para que se repita el bucle
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarProducto(new Alimento());
                    break;

                case 2:
                    agregarProducto(new Tecnologia());
                    break;

                case 3:
                    agregarProducto(new Electrodomestico());
                    break;

                case 4:
                    mostrarInventario();
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close(); // Cerrar el scanner al finalizar
    }

    private void agregarProducto(Producto producto) {
        producto.ingresarProducto();
        inventario.add(producto);
        System.out.println(producto.getClass().getSimpleName() + " agregado al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("\n---- Inventario ----");
        for (Producto producto : inventario) {
            System.out.println(producto.nombre + " " + producto.toString());
        }
    }
}


