package eje7;

import java.util.Date;

public abstract class Transaccion {
    private float monto;
    private Date fecha;
    private Banco bancoDestino;
    private Cliente clienteOrigen;
    
    public Transaccion(Date fecha, Banco bancoDestino, float monto, Cliente clienteOrigen) {
        this.fecha = fecha;
        this.bancoDestino = bancoDestino;
        this.monto = monto;
        this.clienteOrigen = clienteOrigen;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    public float getMonto() {
        return monto;
    }

    public Banco getBancoDestino() {
        return bancoDestino;
    }
    public void setBancoDestino(Banco bancoDestino) {
        this.bancoDestino = bancoDestino;
    }
    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }
    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFecha() {
        return fecha;
    }

    public abstract float montoEnPesos();
    public abstract float montoConImpuesto();

}
