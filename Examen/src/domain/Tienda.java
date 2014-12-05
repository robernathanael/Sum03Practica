package domain;

import workflow.*;

public class Tienda {
	private CatalogosDeProducto productCatalog = new CatalogosDeProducto();
	private POST post = new POST( productCatalog );

	public POST getPOST() { return post; }
}
