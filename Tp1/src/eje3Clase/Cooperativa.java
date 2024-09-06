package eje3Clase;

import java.util.List;
import java.util.ArrayList;

public class Cooperativa {
    private final List<Chofer> choferes=new ArrayList<Chofer>();
     
    public Chofer realizarViaje(int cantPasajeros, int cantKmts){
        for(Chofer chofer:choferes){
            if(chofer.realizarViaje(cantPasajeros,cantKmts)){ //le pregunto directamente al chofer si puede realizar el viaje
                return chofer;
            }
        }
        return null;
    }
    /*Devuelve el chofer de la cooperativa que pueda realizar el viaje
    para la cantidad de pasajeros solicitada y registra el kilometraje del
    viaje.*/

    public Colectivo mayorKilometro() {
        int mayorKm=0;
        Colectivo cMax=null;
        for(Chofer c:choferes){
            if(c.getKilometraje()>mayorKm){
                mayorKm=c.getKilometraje();
                cMax=c.getColectivo();
            }
        }
        return cMax;
    }
    /*Devuelve el colectivo con mayor kilometraje acumulado.*/
	public void addChofer(Chofer c) {
		choferes.add(c);
	}

}
