package eje4;
import java.util.Date;

public class Artículo implements Producto {
    private String nombre;
	private Date vencimiento;
	private int precio;
	private int peso;

    public Artículo(int peso,int precio){
        this.precio=precio;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getVencimiento() {
        return vencimiento;
    }
    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    @Override
    public int getPeso() {
        return this.peso;
    }
    @Override
    public int getPrecio() {
        return this.precio;
    }
}
