package eje3;

public class Cuadrado implements FiguraGeometrica{

    public Cuadrado(int lado){
        this.lado=lado;
    }
    private float lado;

    @Override
    public float area() {
        return lado*lado;
    }
}
