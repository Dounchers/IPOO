package eje7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear algunos clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan Pérez");
        cliente1.setDni(12345678);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Ana Gómez");
        cliente2.setDni(87654321);

        // Crear un banco
        Banco banco = new Banco("Banco Central", "Calle Falsa 123", "País Imaginario") {
            // Implementación necesaria porque Banco es una clase abstracta
        };

        // Crear algunas transacciones
        Transaccion transaccionNacional = new TransaccionNacional(new Date(), banco, 1000, cliente1);
        Transaccion transaccionInternacional = new TransaccionInternacional(new Date(), banco, 500, cliente2);
        ((TransaccionInternacional) transaccionInternacional).setMoneda(Moneda.EURO);

        // Agregar transacciones al banco
        banco.agregarTransaccion(transaccionNacional);
        banco.agregarTransaccion(transaccionInternacional);

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Mostrar información del banco
        System.out.println("Nombre del banco: " + banco.getNombre());
        System.out.println("Dirección: " + banco.getDireccion());
        System.out.println("País: " + banco.getPais());

        // Mostrar transacciones
        System.out.println("Cantidad total de transacciones: " + banco.cantidadTotalDeTransacciones());
        System.out.println("Monto total de transacciones en pesos: " + banco.montoTotalDeTransacciones());
        System.out.println("Impuestos totales a cobrar: " + banco.impuestosACobrar());

        // Mostrar detalles de una transacción específica
        System.out.println("Monto de la transacción nacional en pesos: " + transaccionNacional.montoEnPesos());
        System.out.println("Monto de la transacción nacional con impuesto: " + transaccionNacional.montoConImpuesto());

        System.out.println("Monto de la transacción internacional en pesos: " + transaccionInternacional.montoEnPesos());
        System.out.println("Monto de la transacción internacional con impuesto: " + transaccionInternacional.montoConImpuesto());
    }
}
