package entiteies;

public class Products {
	
	public String name;
	public Double price;
	public Integer itensNumber;
	
	
	public Products(String name , Double price, Integer itensNumber){
		
		this.name = name;
		this.price = price;
		this.itensNumber = itensNumber;
	}


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


	public Integer getItensNumber() {
		return itensNumber;
	}


	public void setItensNumber(Integer itensNumber) {
		this.itensNumber = itensNumber;
	}
	
	public double totalValue() {
		
		return price * itensNumber;
	}
}
