package domain;

import java.util.*;

public class CatalogosDeProducto {
  private DatosDeCatalogoDeProductos data = new DatosDeCatalogoDeProductos(new Hashtable());

public CatalogosDeProducto() {
    EspecificacionDeProducto ps =
        new EspecificacionDeProducto(1, 100, "product 1");
    data.productSpecifications.put(new Integer(1), ps);
    ps = new EspecificacionDeProducto(2, 200, "product 2");
    data.productSpecifications.put(new Integer(2), ps);

    ps = new EspecificacionDeProducto(3, 300, "product 3");
    data.productSpecifications.put(new Integer(3), ps);
    ps = new EspecificacionDeProducto(4, 400, "product 4");
    data.productSpecifications.put(new Integer(4), ps);

  }

  public EspecificacionDeProducto specification(int upc) {
    return (EspecificacionDeProducto) data.productSpecifications.get(new Integer(upc));
  }
}
