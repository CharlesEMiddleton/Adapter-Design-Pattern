
public class Product implements ProductListing{
	/**
	 * instance variables
	 */
	private String title;
	private double price;
	private String description;
	/**
	 * parameter constructor
	 * @param title name
	 * @param price cost 
	 * @param description brief summary
	 */
	
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
		
	}
	/**
	 * getter for title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * getter for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * getter for description
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	

}
