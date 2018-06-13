import java.util.ArrayList;

public class Building {
	
	private String name;
	private ArrayList<Room> rooms=new ArrayList<Room>();
	
	public ArrayList<Room> getRooms() {
		 return rooms;
	}
	
	public String getName() {
	   	 return name;
	}
	
	public Building(String name) {
		 this.name=name;
	}
	public void addRoom(String room_name, int area, int win_num) {
		 rooms.add(new Room(room_name, area, win_num));		 
	}
	
	public Room getRoom(String room_name) { 
		 Room result = null;
		 for (Room temp : rooms) {
	            if (room_name.equals(temp.getName())) {
	                result = temp;
	            }
	        }
	        return result;
	    }
	
	public void describe() { //Describing our building
		System.out.println(getName());
		rooms.stream().filter( p ->{
			return ((p.getFreeArea()/p.getArea()*100)>30)&&(!(p.getFurnitureList().isEmpty()))&&(p.getRoomIllumination()>300)&&(p.getRoomIllumination()<4000);
			}).forEach(b->System.out.println(" "+b.getName()+" Free area: "+b.getFreeArea()+" m^2 or "+(b.getFreeArea()/b.getArea())*100+"% ;"+" Illumination is "+b.getRoomIllumination()+" lx \r"+" "+b.getFurnitureList()));
		rooms.stream().filter( p ->{
			return ((p.getFreeArea()/p.getArea()*100)>30)&&(p.getFurnitureList().isEmpty())&&(p.getRoomIllumination()>300)&&(p.getRoomIllumination()<4000);
			}).forEach(b->System.out.println(" "+b.getName()+" Free area: "+b.getFreeArea()+" m^2 or "+(b.getFreeArea()/b.getArea())*100+"% ;"+" Illumination is "+b.getRoomIllumination()+" lx \r"+"  There is no furniture in this room \r"));
		rooms.stream().filter( p ->{
			return ((p.getFreeArea()/p.getArea()*100)<30);
			}).forEach(b->System.err.println(" "+b.getName()+" is crammed, free room size is "+(b.getFreeArea()/b.getArea()*100)+"%, it has to be more then 30% \r"));
		rooms.stream().filter( p ->{
			return ((p.getRoomIllumination()<300));
			}).forEach(b->System.err.println(" "+b.getName()+" has a illumination of "+b.getRoomIllumination()+" lx, it has to be more than 300 lx \r"));
		rooms.stream().filter( p ->{
			return ((p.getRoomIllumination()>4000));}
		).forEach(b->System.err.println(" "+b.getName()+" has a illumination of "+b.getRoomIllumination()+" lx, it has to be less than 4000 lx \r"));
	}		
} 
	 
	

