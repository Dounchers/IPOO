package eje3;

public class Chofer{
    private String nombre;
    private Colectivo colectivo;

    Chofer(String nombre,Colectivo colectivo){
        this.nombre=nombre;
        this.colectivo=colectivo;
    }
    public Colectivo getColectivo(){
        return this.colectivo;
    }
    public void setColectivo(Colectivo colectivo){
        this.colectivo=colectivo;
    }
    public boolean realizarViaje(int cantPas,int cantKmts){
        return colectivo.realizarViaje(cantPas, cantKmts);

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}