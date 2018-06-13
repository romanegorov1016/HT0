
public class Furniture {
	private String furniture_name;
	private double furniture_area;
	
	public Furniture(String furniture_name, double furniture_area) {
		this.setFurniture_name(furniture_name);
		this.setFurniture_area(furniture_area);
	}

	public String getFurniture_name() {
		return furniture_name;
	}
	public void setFurniture_name(String furniture_name) {
		this.furniture_name = furniture_name;
	}
	public double getFurniture_area() {
		return furniture_area;
	}
	public void setFurniture_area(double furniture_area) {
		this.furniture_area = furniture_area;
	}
	public String toString() {
		 return " Furniture name: " + furniture_name
	                + "; Furniture area: " + furniture_area+" m^2\r";  		
   }
 
}
