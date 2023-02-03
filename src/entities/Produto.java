package entities;


public class Produto {
	
	private String name;
	private double price;
	private int quantity;
	
	
	
	public Produto() {
		super();
	}

	public Produto(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Produto [name = " + name + ", Price = $ " +  price + ", quantity = " + quantity + "units, Total: $ " +  TotalValueInStock() + " ]";
	}
	
	 
	public double TotalValueInStock() {
		double total = quantity * price;
		return total;
		
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity++;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity--;
	}
	
}
