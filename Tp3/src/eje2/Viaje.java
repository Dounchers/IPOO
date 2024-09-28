package eje2;
import java.util.Date;;

public class Viaje {
    public Viaje(int millas){
        this.millas=millas;
        //this.fecha=
    }


    private int millas;
    private Date fecha;
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getMillas() {
        return millas;
    }
    public void setMillas(int millas) {
        this.millas = millas;
    }
}
