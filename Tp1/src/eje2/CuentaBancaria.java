package eje2;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class CuentaBancaria{
    private Persona titular;
    private Date fechaDeApertura;
    private List<Transaccion> transacciones=new ArrayList<Transaccion>();

    private int saldo;

    private static final String DEPOSITO = "Deposito";
	private static final String EXTRACCION = "Extracción";

    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public Date getFecha() {
		return fechaDeApertura;
	}
	public void setFecha(Date fecha) {
		this.fechaDeApertura = fecha;
	}
    public void extraer(int extraccion){
        if(saldo-extraccion>limiteMinimo()){
            saldo-=extraccion;
            addTransaccion(new Transaccion(extraccion,EXTRACCION));
        }
    }
    public void depositar(int deposito){
        saldo+=deposito;
        addTransaccion(new Transaccion(deposito,DEPOSITO));
    }
    private void addTransaccion(Transaccion t) {
		transacciones.add(t);
	}
    public abstract int limiteMinimo();

	public Persona getTitular() {
		return this.titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public abstract void reinicio();
}