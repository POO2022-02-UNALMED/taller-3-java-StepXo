public class Control {
    private TV tv;

    void enlazar(TV tv){
        this.tv = tv;               //attributo -tv- apuntar a objeto -tv-
        this.tv.setControl(this);   //el atributo -tv.control- apunte a -este.control-
    }

    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        this.tv.turnOn();
    }
    public void turnOff(){
        this.tv.turnOff();
    }

    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }

    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }

    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }
}
