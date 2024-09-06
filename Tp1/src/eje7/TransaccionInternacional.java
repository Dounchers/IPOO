package eje7;

import java.util.Date;

public class TransaccionInternacional extends Transaccion{
    private static final float IMPUESTO=1.07f;
    private Moneda moneda;

    public TransaccionInternacional(Date fecha, Banco bancoDestino, float monto, Cliente clienteOrigen) {
        super(fecha, bancoDestino, monto, clienteOrigen);
    }
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    public Moneda getMoneda() {
        return moneda;
    }

    public float montoEnPesos(){
        return this.getMonto()*moneda.tipoCambio();
    }
    
    public float montoConImpuesto(){
        return montoEnPesos()*IMPUESTO;
    }

}
