
public class Main {
	public static void main(String[] args) {
		
		Building building = new Building("Building 1");
		building.addRoom("Room1", 100, 3);
		building.addRoom("Room2", 5, 2);
		building.addRoom("Room3", 15, 1);
		building.getRoom("Room1").addLamp(150);
		building.getRoom("Room2").addLamp(250);
		building.getRoom("Room1").add("Table", 3);
		building.getRoom("Room1").add("Big soufa", 7);
		building.getRoom("Room2").add("Soufa", 2);
		building.describe();
	}
	
}