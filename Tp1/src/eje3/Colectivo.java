package eje3;

public class Colectivo {
    private int cantPasajeros;
    private Chofer chofer;
    private int Patente;
    private String modelo;
    private int kilometraje;



    public void setCantPasajeros(int c){
        this.cantPasajeros=c;
    }
    public int getCantPasajeros(){
        return this.cantPasajeros;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
    }
    public int getKilometraje(){
        return this.kilometraje;
    }
    
    public boolean realizarViaje(int cantPasajeros,int cantKmts){
        if (this.cantPasajeros>cantPasajeros) {
            this.kilometraje+=cantKmts;
            return true;
        }
        return false;
    }
    public Chofer getChofer() {
        return chofer;
    }
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPatente() {
        return Patente;
    }
    public void setPatente(int patente) {
        Patente = patente;
    }
}

