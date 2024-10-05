package eje7;

public class Pizza {
    private String masa;
    private boolean queso;
    private boolean salsa;
    private boolean peperoni;
    private boolean champiñones;

    public void setMasa(String masa){
        this.masa=masa;
    }
    public void setQueso(boolean queso) {
        this.queso = queso;
    }
    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }
    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }
    public void setPeperoni(boolean peperoni) {
        this.peperoni = peperoni;
    }
    public String toString() {
        return "Pizza [Masa: " + masa + ", Queso: " + (queso? "Sí" : "No") + ", Salsa: "+ (salsa ? "Sí" : "No") + ", Peperoni: " + (peperoni ? "Sí" : "No") +
               ", Champiñones: " + (champiñones ? "Sí" : "No") + "]";
    }
}
