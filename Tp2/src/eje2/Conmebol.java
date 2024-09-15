package eje2;

import java.util.List;
import java.util.ArrayList;

public class Conmebol {
    private List <Partido> partidos = new ArrayList<>();
    private List <Estadio> estadios = new ArrayList<>();
    
    public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, int valorEntrada){
        partidos.add(new Partido(local, visita, estadio, valorEntrada));
    }
    //Retorna el estadio con mayor capacidad de espectadores
    public Estadio estadioConMayorCapacidad(){
        Estadio aux=null;
        int capMax=0;
        for(Estadio e:estadios){
            int c=e.getCapacidadTotal();
            if(c>capMax){
                aux=e;
                capMax=c;
            }
        }
        return aux;
    }
    //Retorna la suma de todos los espectadores de todos los partidos. Es decir, la suma de la capacidad de cada estadio de cada partido.
    public int cantidadTotalEspectadores(){
        int sum=0;
        for(Estadio e:estadios){
            sum+=e.getCapacidadTotal();
        }
        return sum;
    }
     //Retorna la suma recaudada en el partido que se pasa como parámetro.
    public float montoRecaudado(Partido partido){
        return partido.montoRecaudado();
    }
    //Retorna la suma total recaudada por todos los partidos de la copa
    public float montoTotalRecaudado(){
        float sum=0;
        for(Partido p:partidos){
            sum+=p.montoRecaudado();
        }
        return sum;
    }

}
