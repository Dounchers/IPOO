package eje8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class EstaciónMeteorológica {
    Clima climaActual = new Clima();
    List <Clima> historial= new ArrayList<>();

    public Clima climaActual(){
        return climaActual;
    }
    public void agregarClima(Clima unClima){
        historial.add(unClima);
    }
    public void eliminarClima(Clima unClima){ 
        historial.remove(unClima);
    } 
    public List<Clima> getClimas(){
        return historial;
    }
    public List<Clima> ordenarClimaPorTemperatura(){
        List<Clima>sortedClimas=new ArrayList<>(historial);
        Collections.sort(sortedClimas, new Comparator<Clima>() {
            public int compare(Clima o1, Clima o2) {
                return o1.getActual().compareTo(o2.getActual());
            }
        });
        return sortedClimas;
    }
    public List<Clima> ordenarClimaPorFecha(){
        List<Clima>sortedClimas=new ArrayList<>(historial);
        Collections.sort(sortedClimas, new Comparator<Clima>() {
            public int compare(Clima o1, Clima o2) {
                return o1.getUltimaActualizacion().compareTo(o2.getUltimaActualizacion());
            }
        });
        return sortedClimas;
    }
}
