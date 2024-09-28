package eje2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pasajero implements Frecuencia{
    private List <Viaje> viajes=new ArrayList();
    @Override
    public int millas(){
        int sum=0;
        for(Viaje v:viajes){
            sum+=v.getMillas();
        }
        return sum;
    }
    @Override
    public Date ultimoViaje(){
        
        //return(viajes.get(viajes.size()-1).getFecha());
    }
    public void agregarViaje(Viaje viaje){
        viajes.add(viaje);
    }
}
