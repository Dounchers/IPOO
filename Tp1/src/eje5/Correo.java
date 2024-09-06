package eje5;

import java.util.List;

public class Correo {
    //private String asunto;
    //private String texto;
    private Boolean leído;
    //private Contacto contacto;

    public Boolean getLeído() {
        return leído;
    }
    public void setLeído(Boolean leído) {
        this.leído = leído;
    }

    public void agregarNoLeídos(List<Correo> l) {
        if(!getLeído())
            l.add(this);
    }
}
