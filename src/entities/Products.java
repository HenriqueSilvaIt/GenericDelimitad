package entities;

public class Products implements Comparable<Products> {
	private String name;
	private Double price;
	
	// Construtores
	
	public Products() {
		
	}
	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Get and set
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ", ");
		sb.append(String.format("%.2f", price));
		return sb.toString();
	}
	
	@Override
	public int compareTo(Products other) {
		// TODO Auto-generated method stub
		return price.compareTo(other.getPrice());
	}
		
}
