package eje3;

public class Circulo implements FiguraGeometrica{
    private float radio;
    
    public Circulo(float radio){
        this.radio=radio;
    }
    
    @Override
    public float area() {
        return 3.14f*radio*radio;
    }
}
