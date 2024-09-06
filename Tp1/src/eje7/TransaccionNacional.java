package eje7;
import java.util.Date;

public class TransaccionNacional extends Transaccion {
    
    private static final float IMPUESTO = 1.08f;
   
    public TransaccionNacional(Date fecha, Banco bancoDestino, float monto, Cliente clienteOrigen) {
        super(fecha, bancoDestino, monto, clienteOrigen);
    }

    @Override
    public float montoEnPesos() {
        return this.getMonto();
    }
    
    @Override
    public float montoConImpuesto() {
        return montoEnPesos()*IMPUESTO;
    }
}
