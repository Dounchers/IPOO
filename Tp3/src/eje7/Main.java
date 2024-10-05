package eje7;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        PizzaBuilder pizzaMargheritaBuilder = new PizzaMargheritaBuilder();

        cliente.setPizzaBuilder(pizzaMargheritaBuilder);
        cliente.construirPizza();

        Pizza pizza = cliente.getPizza();
        System.out.println("Pizza creada: " + pizza);
    }
}
