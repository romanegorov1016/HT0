
public class Main {
	public static void main(String[] args) {
		
		Building building = new Building("Building 1");
		building.addRoom("Room1", 100, 3); //Adding a room with an area of 100 m^2 and 3 windows
		building.addRoom("Room2", 5, 2);
		building.addRoom("Room3", 15, 1);
		building.addRoom("Room4", 40, 2);
		building.addRoom("Room1408", 35, 0);
		building.addRoom("Room5", 24, 2);
		building.getRoom("Room1").addLamp(150);//Adding a lamp with brightness of 150 lx
		building.getRoom("Room2").addLamp(250);
		building.getRoom("Room5").addLamp(4550);
		building.getRoom("Room1").add("Table", 3); //Adding a furniture with name "Table" and with the area of 3 m^2
		building.getRoom("Room1").add("Big soufa", 7);
		building.getRoom("Room2").add("Soufa", 2);
		building.getRoom("Room4").add("Something really big", 30);	
		building.describe();
	}	
}