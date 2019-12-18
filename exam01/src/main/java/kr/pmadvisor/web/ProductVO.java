package kr.pmadvisor.web;

public class ProductVO {
	
	private String name;
	private double price;

	// Source --> Generate Construct with parameter 
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	// Source --> Generate getter
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	// Source --> Generate toString()
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	
}
