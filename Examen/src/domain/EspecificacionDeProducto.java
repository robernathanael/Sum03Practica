package domain;

public class EspecificacionDeProducto {
	private int    upc         = 0;
	private float  price       = 0;
	private String description = "";

	public EspecificacionDeProducto( int upc, float price, String description )
		{
		this.upc         = upc;
		this.price       = price;
		this.description = description;
		}

	public int getUPC() { return upc;	}
	public float getPrice() { return price; }
	public String getDescription() { return description; }
}
