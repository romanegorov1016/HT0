import java.util.ArrayList;

public class Room {
	private String room_name;
    private double room_area;
    private double free_room_area;
    private int win_num;
    private double room_illumination;
    private ArrayList<Lamp> lamp_list = new ArrayList<Lamp>();
    private ArrayList<Furniture> furniture_list = new ArrayList<Furniture>();
   
    public Room(String room_name, double room_area, int win_num) {
    	 this.room_name=room_name;
    	 this.win_num=win_num;
    	 this.room_area=room_area;
    	 this.free_room_area=room_area;
    	 this.room_illumination=win_num*700; 
    }
    
    public ArrayList<Lamp> getLampList() {
		 return lamp_list;
    }
    
    public ArrayList<Furniture> getFurnitureList() {
		 return furniture_list;
    }
    
    public String getName() {
   	     return room_name;
    }
    
    public int getNumOfWindows() {
   	 	 return win_num;
    }
    
    public double getArea() {
   	 	 return room_area;
    }
    
    public double getRoomIllumination() {
  	 	 return room_illumination;
    }
    
    public double getFreeArea() {
  	 	 return free_room_area;
    }
    
    public void addLamp(double lamp_brightness) {
    	 lamp_list.add(new Lamp(lamp_brightness));
    	 room_illumination=getRoomIllumination()+lamp_brightness; 	 
    }
    
    public void add(String furniture_name, double furniture_area) { // add furniture by name and area
         furniture_list.add(new Furniture(furniture_name, furniture_area));
         free_room_area=getFreeArea()-furniture_area;
    }
     
}
