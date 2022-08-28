package taller3.televisores;
public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV++;
    }

    //Setters
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    //Getters
    public Marca getMarca() {
        return marca;
    }
    public Control getControl() {
        return control;
    }
    public int getPrecio() {
        return precio;
    }
    public int getVolumen() {
        return volumen;
    }
    public int getCanal() {
        return canal;
    }
    public boolean getEstado() {
        return estado;
    }

    //otros metodos
    public void turnOn(){
        this.estado =true;
    }                       //una cosa rara para el "setEstado"
    public  void turnOff(){
        this.estado =false;
    }

    public void canalUp(){
        if (estado && this.canal>1 && this.canal<120) {
        this.canal++;
        }
    }
    public void canalDown(){
        if (estado && this.canal>1 && this.canal<120) {
            this.canal--;
        }
    }

    public void volumenUp(){
        if (estado && this.volumen<7 && this.volumen>0) {
        this.volumen++;
        }
    }
    public void volumenDown(){
        if (estado && this.volumen<7 && this.volumen>0) {
            this.volumen--;
        }
    }
}
