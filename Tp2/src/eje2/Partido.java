package eje2;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private Estadio estadio;
    private float valorEntrada;

    public Partido(Equipo local,Equipo visitante,Estadio estadio, float valorEntrada){
        this.local=local;
        this.visitante=visitante;
        this.estadio=estadio;
        this.valorEntrada=valorEntrada;
    }

    public float montoRecaudado(){
        return valorEntrada*estadio.getCapacidadTotal();
    }

    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public Equipo getVisitante() {
        return visitante;
    }
    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
    public Equipo getLocal() {
        return local;
    }
    public void setLocal(Equipo local) {
        this.local = local;
    }
    public float getValorEntrada() {
        return valorEntrada;
    }
    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

}
