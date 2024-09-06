package eje3;
import java.util.List;
import java.util.ArrayList;

public class Cooperativa {
    private List<Chofer> choferes=new ArrayList<Chofer>();
     
    public Chofer realizarViaje(int cantPasajeros, int cantKmts){
        for(Chofer chofer:choferes){
            if(chofer.realizarViaje(cantPasajeros,cantKmts)){
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
            if(c.getColectivo().getKilometraje()>mayorKm){ //CORRECIÓN, NO ES BUENA PRÁCTICA QUE SE ROMPA EL ENCAPSULAMIENTO
                                                            //SI HAGO C.GETCOLECTIVO ESOTY SABIENDO QUE MANEJA CADA CHOFER DESDE COOPERATIVA
                mayorKm=c.getColectivo().getKilometraje();
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
