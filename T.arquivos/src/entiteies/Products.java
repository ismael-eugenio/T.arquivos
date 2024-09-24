package entiteies;

public class Products {
	
	public String name;
	public double price;
	public int itensNumber;
	
	
	public Products(String name , double price, int itensNumber){
		
		name = name;
		this.price = price;
		this.itensNumber = itensNumber;
	}


	public String getName() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getItensNumbers() {
		return itensNumber;
	}


	public void setItensNumbers(int itensNumber) {
		this.itensNumber = itensNumber;
	}
	
	public double totalValue() {
		
		return price * itensNumber;
	}
}
