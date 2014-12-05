package domain;

class LineaDeVenta {
  int	quantity;
  EspecificacionDeProducto	productSpec;

   public LineaDeVenta(EspecificacionDeProducto spec, int quantity )
	{
		this.productSpec = spec;
		this.quantity = quantity;
	}

}
