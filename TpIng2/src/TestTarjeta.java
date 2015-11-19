


import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;




public class TestTarjeta {
	
//	public static void main(String[] args) {
//		Date fecha = new Date ();
//		Tarjeta t = new Tarjeta(true);
//		Colectivo c = new Colectivo("142", "Mixta", 2);
//		//Viaje v = new Viaje(c, fecha, 5.75);
//		
//		
//		t.recarga(300);
//		System.out.println("Su saldo es: $" + t.saldo());
//		
//		
//		System.out.println(t.pagarBoleto(c, fecha));
//		
//		System.out.println(t.saldo());
//		System.out.println(t.viajesRealizados());
//		System.out.println(t.getViajes().size());
////		t.saldo();
//	}
	@Test
	public void test (){
		
		Date fecha = new Date ();
		Tarjeta t = new Tarjeta(true);
		Colectivo c = new Colectivo("142", "Mixta", 2);
		
		
		
		assertEquals("A test for Tarjeta String", "Saldo", t.saldo());
		assertEquals("A test for Tarjeta String", "Saldo", t.pagarBoleto(c, fecha));
//		assertEquals("A test for Tarjeta String", "Saldo", t.recarga(4));
		
	}
}
