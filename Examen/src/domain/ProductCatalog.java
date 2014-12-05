package domain;

import java.util.*;

public class ProductCatalog {
  private ProductCatalogData data = new ProductCatalogData(new Hashtable());

public ProductCatalog() {
    ProductSpecification ps =
        new ProductSpecification(1, 100, "product 1");
    data.productSpecifications.put(new Integer(1), ps);
    ps = new ProductSpecification(2, 200, "product 2");
    data.productSpecifications.put(new Integer(2), ps);

    ps = new ProductSpecification(3, 300, "product 3");
    data.productSpecifications.put(new Integer(3), ps);
    ps = new ProductSpecification(4, 400, "product 4");
    data.productSpecifications.put(new Integer(4), ps);

  }

  public ProductSpecification specification(int upc) {
    return (ProductSpecification) data.productSpecifications.get(new Integer(upc));
  }
}
