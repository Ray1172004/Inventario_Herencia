import java.util.Scanner;
public class Tecnologia extends Producto{
    public Tecnologia(){
    }
    private double almacenamiento;
    private double RAM;
    private String tipoCarga;
    private String conexoinWifi;
    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, double almacenamiento, double RAM, String tipoCarga, String conexoinWifi) {
        super(nombre, precio, codigo, cantidad, marca);
        this.almacenamiento = almacenamiento;
        this.RAM = RAM;
        this.tipoCarga = tipoCarga;
        this.conexoinWifi = conexoinWifi;
    }
    @Override
    public void ingresarProducto() {
        super.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: \n");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto: \n");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el tamaño del alamcenamiento: \n");
        this.almacenamiento=sc.nextDouble();
        System.out.println("Ingres el tipo de RAM: \n");
        this.RAM=sc.nextInt();
        System.out.println("Ingrese el tipo de carga: \n");
        this.tipoCarga=sc.next();
        System.out.println("Ingrese el tipo de conexion de Wifi: \n");
        this.conexoinWifi=sc.next();
    }
    public double getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public double getRAM() {
        return RAM;
    }
    public void setRAM(double RAM) {
        this.RAM = RAM;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }
    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
    public String getConexoinWifi() {
        return conexoinWifi;
    }
    public void setConexoinWifi(String conexoinWifi) {
        this.conexoinWifi = conexoinWifi;
    }
}
 