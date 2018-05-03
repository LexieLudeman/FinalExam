import java.util.ArrayList;

public class GravityControl extends Systems{

	@Override
	public ArrayList<Component> getComponents() {
		return components;
	}

	@Override
	public void setComponents(Component component) {
		components.add(component);
		
	}

}
