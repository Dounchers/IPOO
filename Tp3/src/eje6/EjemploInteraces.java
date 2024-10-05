package eje6;

public class EjemploInteraces {
    public static void main(String[] args) {
        Automóvil auto = new Automóvil();
        acelerar(auto);
        frenar(auto);
        Bicicleta bicicleta = new Bicicleta();
        acelerar(bicicleta);
        frenar(bicicleta);
    }
    public static void acelerar(Vehiculo vehiculo){
        System.out.println(vehiculo.acelerar());
    }
    public static void frenar(Vehiculo vehiculo){
        System.out.println(vehiculo.frenar());
    }
}
