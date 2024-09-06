package eje1;
public class Punto {
    private int x;
    private int y;

    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void sumar(int n){
        this.x+=n;
        this.y+=n;
    }
    public void sumarPunto(Punto unPunto){
        this.x+=unPunto.getX();
        this.y+=unPunto.getY();
    }
    public int distancia(Punto unPunto){
        double deltaX = this.x - unPunto.getX();
        double deltaY = this.y - unPunto.getY();
        return (int) Math.round(Math.sqrt(deltaX * deltaX + deltaY * deltaY));
    }
    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}
