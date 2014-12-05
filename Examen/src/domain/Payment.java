package domain;

class Payment implements Monto {
  private float amount;

  public Payment(float cashTendered) {
    this.amount = cashTendered;
  }

  /* (non-Javadoc)
 * @see domain.Monto#getAmount()
 */
public float getAmount() {
    return amount;
  }

}
