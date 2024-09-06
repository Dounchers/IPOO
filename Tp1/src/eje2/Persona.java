package eje2;

public class Persona {
    private String nombre;
    private int dni;

    Persona(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
}
