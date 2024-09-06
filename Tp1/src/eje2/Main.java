package eje2;

import java.util.GregorianCalendar;

public class Main{
    public static void main(String[] args) {
        Persona t = new Persona("pepito",46262687);
		
		CajaDeAhorro cajaDeAhorro1=new CajaDeAhorro();
		cajaDeAhorro1.setTitular(t);
		cajaDeAhorro1.depositar(20);

		/*String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("12-01-2018");
		Date d = sdf.parse("10/09/2010");*/

		cajaDeAhorro1.setFecha(GregorianCalendar.getInstance().getTime());
		System.out.println(cajaDeAhorro1.getSaldo());

		cajaDeAhorro1.extraer(5);
		System.out.println(cajaDeAhorro1.getSaldo());

        CuentaCorriente cuentaCorriente1=new CuentaCorriente();
        cuentaCorriente1.depositar(100);
        cuentaCorriente1.extraer(250);
        System.out.println(cuentaCorriente1.getSaldo());
        cuentaCorriente1.extraer(150);
        System.out.println(cuentaCorriente1.getSaldo());

    }
}