package eje3Clase;

public class Colectivo {
    private int cantPasajeros;
    private int patente;
    private String modelo;
    private int kilometraje;

    public Colectivo(int cantPasajeros,int patente,String modelo,int kilometraje){
        this.cantPasajeros=cantPasajeros;
        this.patente=patente;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
    }


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
    public boolean realizarViaje(int cantPasajeros,int cantKmts){ //finalmente el vehiculo es quien verdaderamente sabe si puede realizar el viaje
        if (this.cantPasajeros>=cantPasajeros) {
            this.kilometraje+=cantKmts;
            return true;
        }
        return false;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPatente() {
        return patente;
    }
    public void setPatente(int patente) {
        this.patente = patente;
    }
}

