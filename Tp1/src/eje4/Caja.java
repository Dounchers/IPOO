package eje4;
import java.util.List;
import java.util.ArrayList;

public class Caja implements Producto {
    private final List<Artículo>articulos=new ArrayList<>();

    @Override
    public int getPeso() {
        int suma=0;
        for(Artículo a:articulos){
            suma+=a.getPeso();
        }
        return suma;
    }
    @Override
    public int getPrecio() {
        int suma=0;
        for(Artículo a:articulos){
            suma+=a.getPrecio();
        }
        return suma;
    }

    public void agregarArticulo(Artículo a){
        articulos.add(a);
    }
}
