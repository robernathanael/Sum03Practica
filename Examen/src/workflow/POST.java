package workflow;

import domain.*;


public class POST {
	private CatalogosDeProducto productCatalog;
	private Venta sale;

	public POST( CatalogosDeProducto catalog )
	{
		productCatalog = catalog;
	}

	public void endSale()
	{
		sale.becomeComplete();
	}

	public void EnterItem( int upc, int quantity )
	{
		if( isNewSale() )
		{
			sale = new Venta();
		}
		EspecificacionDeProducto spec = productCatalog.specification( upc );
		sale.makeLineItem( spec, quantity );
	}

	public void makePayment( float cashTendered )
	{
		sale.makePayment( cashTendered );
	}

	private boolean isNewSale()
	{
		return ( sale == null ) || ( sale.isComplete() );
	}

        public float getTotal()
        {
          return sale.total();
        }

	public Venta getSale()
	{
		return sale;
	}
}
