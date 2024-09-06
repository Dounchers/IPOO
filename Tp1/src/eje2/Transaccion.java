package eje2;

public class Transaccion {
    private int monto;
    private String tipo;

    Transaccion(int monto,String tipo){
        this.monto=monto;
        this.tipo=tipo;
    }
    
    public int getMonto(){
        return this.monto;
    }
    public void setMonto(int m){
        monto=m;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo=t;
    }

}
