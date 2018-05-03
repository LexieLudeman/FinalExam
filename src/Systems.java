import java.util.ArrayList;

public abstract class Systems {
	protected ArrayList<Component> components;
	public Systems() {
		components = new ArrayList<Component>();
	}
	public abstract ArrayList<Component> getComponents();
	public abstract void setComponents(Component component);
}
