package eje5;

import java.util.ArrayList;
import java.util.List;
public class Cuenta {

    private String nombreDeUsuario; 
    private String direcciónDeMail;
    private String direcciónDelServidorDeEntrada;
    private String direcciónDelServidorDeSalida;

    private List <Contacto>contactos=new ArrayList<>();

    private List <Correo>recibidos=new ArrayList<>();
    private List <Correo>enviados=new ArrayList<>();
    
    public void addEnviados(Correo c) {
        this.enviados.add(c);
    }

    public void addRecibidos(Correo c) {
        enviados.add(c);
    }

    public void addContacto(Contacto c) {
        contactos.add(c);
    }
    public int cantidadDeCorreosRecibidos(){
        return recibidos.size();
    }
    public int cantidadDeCorreosEnviados(){
        return enviados.size();
    }

    public int cantidadNoLeídos() {
        return getListaNoLeídos().size();
    }

    public List<Correo> getListaNoLeídos() {
        List<Correo> l = new ArrayList<Correo>();

        for (Correo c: recibidos)
            c.agregarNoLeídos(l);

        return l;
    }

    public int cantidadDeContactos(){
        return contactos.size();
    }
    
    public void agregarCorreoRecibido(Correo unCorreo){
        recibidos.add(unCorreo);
    }

    public void setDirecciónDeMail(String direcciónDeMail) {
        this.direcciónDeMail = direcciónDeMail;
    }
    public String getDirecciónDeMail() {
        return direcciónDeMail;
    }
    public String getDirecciónDelServidorDeEntrada() {
        return direcciónDelServidorDeEntrada;
    }
    public void setDirecciónDelServidorDeEntrada(String direcciónDelServidorDeEntrada) {
        this.direcciónDelServidorDeEntrada = direcciónDelServidorDeEntrada;
    }
    public String getDirecciónDelServidorDeSalida() {
        return direcciónDelServidorDeSalida;
    }
    public void setDirecciónDelServidorDeSalida(String direcciónDelServidorDeSalida) {
        this.direcciónDelServidorDeSalida = direcciónDelServidorDeSalida;
    }
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
}
