package eje7;

public enum Moneda {
	
	DOLAR(27.09f), YEN(0.24f), EURO(31.49f);
	
	private final float tipoCambio;

	Moneda(float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
    public float tipoCambio(){
        return this.tipoCambio;
    }
}