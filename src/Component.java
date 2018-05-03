
public abstract class Component {
	protected String componentName;
	public Component(String componentName) {
		this.componentName = componentName;
	}
	public abstract String getComponentName();
	
}
