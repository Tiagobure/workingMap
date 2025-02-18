package application;

import java.util.Objects;

public class Voting {
	
	private String name;
	private int quantity;
	
	
	public Voting(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, quantity);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voting other = (Voting) obj;
		return Objects.equals(name, other.name) && quantity == other.quantity;
	}
	
	
	

}
