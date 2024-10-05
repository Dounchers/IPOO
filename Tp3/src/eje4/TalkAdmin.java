package eje4;

public class TalkAdmin {
    public static void main(String[] args) {
        Gato gato=new Gato();
        hacerHablar(gato);
        Perro perro=new Perro();
        hacerHablar(perro);
        RelojCucu relojCucu= new RelojCucu();
        hacerHablar(relojCucu);
    }
    public static void hacerHablar(Hablador sujeto){
        System.out.println(sujeto.hablar());
    }
}
