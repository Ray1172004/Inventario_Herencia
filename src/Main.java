public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();

        Alimento a1 = new Alimento();
        a1.ingresarProducto();
        System.out.println(a1.toString());

        Tecnologia t1 = new Tecnologia();
        t1.ingresarProducto();
        System.out.println(t1.toString());

        Electrodomestico e1 = new Electrodomestico();
        e1.ingresarProducto();
        System.out.println(e1.toString());
    }
}
