package eje5;
public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.addEnviados(new Correo());
        c1.addEnviados(new Correo());
        c1.addRecibidos(new Correo());

        Cuenta c2 = new Cuenta();
        c2.addEnviados(new Correo());
        c2.addEnviados(new Correo());

        ClienteDeCorreo cliente = new ClienteDeCorreo();
        cliente.setCuenta(c1);
        cliente.addContacto(new Contacto());

        cliente.setCuenta(c2);
        System.out.println(cliente.cantidadDeCorreosEnviados());
    }
}

