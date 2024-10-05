package eje7;

public interface PizzaBuilder{
    public abstract void crearPizza();
    public abstract void tipoDeMasa(String masa);
    public abstract void agregarQueso();
    public abstract void agregarSalsa();
    public abstract void agregarPeperoni();
    public abstract void agregarChampiñones();
    public abstract Pizza getPizza();
}
