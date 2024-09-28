package eje3;

public class Rectangulo implements FiguraGeometrica{
    private float base;
    private float altura;
    
    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public float area() {
        return base*altura;
    }
}
