package domain;

class LineaDeVenta {
  private int	quantity;
  private	EspecificacionDeProducto	productSpec;

   public LineaDeVenta(EspecificacionDeProducto spec, int quantity )
	{
		this.productSpec = spec;
		this.quantity = quantity;
	}

	public float subtotal() { return quantity * productSpec.getPrice(); }

}
