package eje3Clase;

public class Chofer{
    private String nombre;
    private Colectivo colectivo;

    Chofer(String nombre,Colectivo colectivo){
        this.nombre=nombre;
        this.colectivo=colectivo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Colectivo getColectivo(){
        return this.colectivo;
    }
    public void setColectivo(Colectivo colectivo){
        this.colectivo=colectivo;
    }
    public boolean realizarViaje(int cantPas,int cantKmts){ //el chofer delega la rensabilidad a su vehiculo
        return colectivo.realizarViaje(cantPas, cantKmts);
    }
    public int getKilometraje(){
        return colectivo.getKilometraje();
    }


}