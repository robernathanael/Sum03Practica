package paquetedepruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import workflow.POST;
import domain.Tienda;

public class p {
	Tienda t;
	POST p;
	
	@Before
	public void setUp() throws Exception {
		t = new Tienda();
		p = t.getPOST();
	}
	
	@Test
	public void PU() 
	{
		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		p.EnterItem(1,1);
		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		p.EnterItem(2,2);
		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		p.EnterItem(1,1);
		System.out.println("Finalizo la venta...");
		p.endSale();
		System.out.println("Total de la venta..."+p.getSale().total());
		System.out.println("Pago con 650 pesos...");
		p.makePayment(650);
		System.out.println("La feria es: ..."+ p.getSale().getBalance());
		assertTrue(p.getSale().getBalance()==50.0);
	}
}