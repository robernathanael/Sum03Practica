package domain;

class Pago implements Monto {
  private float amount;

  public Pago(float cashTendered) {
    this.amount = cashTendered;
  }

  /* (non-Javadoc)
 * @see domain.Monto#getAmount()
 */
public float getAmount() {
    return amount;
  }

}
