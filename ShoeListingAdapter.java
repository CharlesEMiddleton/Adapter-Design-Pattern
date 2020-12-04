
public class ShoeListingAdapter implements ProductListing {
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;

	public ShoeListingAdapter(ShoeListing shoe) {
		String info = shoe.toString();
		title = info.substring(info.indexOf("Shoe:")+6,info.indexOf("By:"));
		price = Double.parseDouble(info.substring(info.indexOf("$")));
		brand = info.substring(info.indexOf("By:")+4, info.indexOf("Details:"));
		description = info.substring(info.indexOf("Deatils:")+9,info.indexOf("Cost:"));
	}
	
	public String getTitle() {
		return title;	
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return "Created by" + brand + "," + description;
	}
	
	
}
