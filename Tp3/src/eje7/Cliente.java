package eje7;

public class Cliente {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb){
        this.pizzaBuilder=pb;
    }

    public void construirPizza(){
        pizzaBuilder.crearPizza();
        pizzaBuilder.tipoDeMasa("Rellena");
        pizzaBuilder.agregarQueso();
        pizzaBuilder.agregarSalsa();
        pizzaBuilder.agregarPeperoni();
        pizzaBuilder.agregarChampiñones();
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
}
