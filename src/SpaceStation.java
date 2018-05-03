import java.util.ArrayList;

public class SpaceStation {
	
	private ArrayList<Systems> StationSystems;
	
	public SpaceStation() {
		StationSystems = new ArrayList<Systems>();
	}
	
	
	public ArrayList<Systems> getStationSystems() {
		return StationSystems;
	}


	public void addSystems(Systems system) {
		StationSystems.add(system);
	}



	public static void main(String[] args) {
		SpaceStation station = new SpaceStation();
		GravityControl gc = new GravityControl();
		
		
	}

}
