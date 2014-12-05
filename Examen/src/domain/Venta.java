package domain;

import java.util.*;

public class Venta {
	private Vector lineItems = new Vector();
	private Date date = new Date();
	private boolean isComplete = false;
	private Monto payment;

	public float getBalance()
	{
		return payment.getAmount() - total();
	}

	public void becomeComplete()
	{
		isComplete = true;
	}

	public boolean isComplete() { return isComplete; }

	public void makeLineItem( EspecificacionDeProducto spec, int quantity )
	{
		lineItems.addElement( new LineaDeVenta( spec, quantity ) );
	}

	public float total()
	{
		float total = 0;
		Enumeration	e = lineItems.elements();

		while( e.hasMoreElements() )
			{
			total += ( (LineaDeVenta) e.nextElement() ).subtotal();
			}
		return total;
	}

	public void makePayment( float cashTendered )
	{
		payment = new Pago( cashTendered );
	}
}
