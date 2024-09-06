package eje3Clase;

public class App {
    public static void main(String[] args) {
        Colectivo c1= new Colectivo(20, 12345,"Mercedes", 20);
        Chofer chofer1= new Chofer("PACO",c1);

        Cooperativa coop1 = new Cooperativa();
        coop1.addChofer(chofer1);

        System.out.println(coop1.realizarViaje(20, 15));

    }
}