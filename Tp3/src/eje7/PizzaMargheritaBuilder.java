package eje7;

public class PizzaMargheritaBuilder implements PizzaBuilder{
    private Pizza pizza;
    
    public Pizza getPizza() {
        return pizza;
    }
    @Override
    public void crearPizza() {
        this.pizza = new Pizza();
    }
    @Override
    public void tipoDeMasa(String masa) {
        this.pizza.setMasa(masa);
    }
    @Override
    public void agregarQueso(){
        this.pizza.setQueso(true);
    }
    @Override
    public void agregarSalsa() {
        this.pizza.setSalsa(true);
    }
    @Override
    public void agregarChampiñones() {
        this.pizza.setChampiñones(false);
    }
    @Override
    public void agregarPeperoni() {
        this.pizza.setPeperoni(false);
    }
}
