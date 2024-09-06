package eje5;

public class ClienteDeCorreo{
    private Cuenta cuenta;

    public ClienteDeCorreo(){

    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void addEnviados(Correo c) {
        cuenta.addEnviados(c);
    }

    public void addRecibidos(Correo c) {
        cuenta.addRecibidos(c);
    }

    public void addContacto(Contacto c) {
        cuenta.addContacto(c);
    }

    public int cantidadTotalDeCorreos(){
        return(cuenta.cantidadDeCorreosRecibidos() + cuenta.cantidadDeCorreosEnviados());
    }
    public int cantidadDeCorreosRecibidos(){
        return cuenta.cantidadDeCorreosRecibidos();
    }
    public int cantidadDeCorreosEnviados(){
        return cuenta.cantidadDeCorreosEnviados();
    }
    public int cantidadNoLeídos(){
        return cuenta.cantidadNoLeídos();
    }
    public int cantidadDeContactos(){
        return cuenta.cantidadDeContactos();
    }
    public void agregarCorreoRecibido(Correo unCorreo){
        cuenta.agregarCorreoRecibido(unCorreo);
    }
}
