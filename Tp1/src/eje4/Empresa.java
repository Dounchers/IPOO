package eje4;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;

    private final List<Contenedor>contenedores=new ArrayList<>();

    public int pesoContenedor(Contenedor unContenedor){
        return unContenedor.getPeso();

    }
    public int pesoContenedores(){
        int suma=0;
        for(Contenedor c:contenedores){
            suma+=pesoContenedor(c);
        }
        return suma;
    }
    public int pesoArticulo(Artículo unArticulo){
        return unArticulo.getPeso();
    }

    public int valorDeLosArticulos(Contenedor unContenedor){  /* Retorna el valor de todos los artículos del contenedor. */
        return unContenedor.getPrecio();
    }
    
    public int valorDeTodosLosArticulo(){  /* Retorna la suma de todos los valores de los contenedores */

        int suma=0;
        for(Contenedor c:contenedores){
            suma+=valorDeLosArticulos(c);
        }
        return suma;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void agregarContenedor(Contenedor c){
        contenedores.add(c);
    }
 
}
