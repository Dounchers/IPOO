package eje4;
import java.util.List;
import java.util.ArrayList;

public class Contenedor {
    private int id;
    private String paisDestino;
    private int pesoMax;

    private List<Producto>productos=new ArrayList<>();

    public int getPeso(){
        int suma=0;
        for(Producto p:productos){
            suma+=p.getPeso();
        }
        return suma;
    }
    public int getPrecio(){
        int suma=0;
        for(Producto p:productos){
            suma+=p.getPrecio();
        }
        return suma;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPaisDestino() {
        return paisDestino;
    }
    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
    public int getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
}
