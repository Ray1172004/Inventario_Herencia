public class Electrodomestico extends Producto{
    private int vidaUtil;
    private String sitioFabrica;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtil, String sitioFabrica, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtil = vidaUtil;
        this.sitioFabrica = sitioFabrica;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico(){

    }
    public double intervaloMantenimiento(){
        double intervalo = vidaUtil/5;
        return intervalo;
    }
    @Override
    public String toString(){
        return "El eletrodomestico "+this.nombre+" es de marca "+this.marca;
    }
    public int getVidaUtil() {
        return vidaUtil;
    }
    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
    public String getSitioFabrica() {
        return sitioFabrica;
    }
    public void setSitioFabrica(String sitioFabrica) {
        this.sitioFabrica = sitioFabrica;
    }
    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }
    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }
    public String getGarantia() {
        return garantia;
    }
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}
 