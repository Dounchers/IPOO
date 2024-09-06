package eje2;

public class CajaDeAhorro extends CuentaBancaria{
    public int limiteMinimo(){
        return 10;
    }
    private int extracciones;
	
	public CajaDeAhorro() {
		reinicio();
	}

    @Override
    public void extraer(int monto){
        if(this.extracciones>0){
            super.extraer(monto);
            this.extracciones--;
         }
    }
    public void reinicio(){
        extracciones=5;
    }
}

