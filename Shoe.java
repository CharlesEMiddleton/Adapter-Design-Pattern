
public class Shoe implements ShoeListing {
private String brand;
private String name;
private double cost;
private String description;

public Shoe (String brand, String name, double cost, String description) {
	this.brand = brand;
	this.name =name;
	this.cost = cost;
	this.description = description;
}
public String toString() {
	String shoe = "";
	shoe = shoe +"Shoe: " + name;
	shoe = shoe +"by: "+brand;
	shoe = shoe+"Details: "+description;
	shoe = shoe+"Cost: $"+ cost;
	return shoe;
}
}
