package eje7;

import java.util.ArrayList;
import java.util.List;

//import eje7.Transaccion;
public class Banco {
    private String nombre;
    private String direccion;
    private String pais;
    
    private final List<Transaccion>transacciones=new ArrayList<>();
    private final List<Cliente>clientes=new ArrayList<>();

    public Banco(String nombre, String direccion, String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
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
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void agregarTransaccion(Transaccion t){
        transacciones.add(t);
    }
    public int cantidadTotalDeTransacciones(){
        return transacciones.size();
    }
    //Retorna el número total de transacciones del banco

    public float impuestoACobrarDe(eje7.Transaccion unaTransaccion){
        return unaTransaccion.montoConImpuesto();
    }

    public float impuestosACobrar(){
        float suma=0;
        for(eje7.Transaccion t:transacciones){
            suma+=t.montoConImpuesto();
        }
        return suma;
    }
    // Retorna la suma de todos los impuestos a cobrar en pesos.
    public float montoTotalDeTransacciones(){
        float suma=0;
        for(eje7.Transaccion t:transacciones){
            suma+=t.montoEnPesos();
        }
        return suma;
    }
    // Retorna la suma en pesos de todas transacciones realizadas.
    public void agregarCliente(Cliente c){
        clientes.add(c);
    }

}
