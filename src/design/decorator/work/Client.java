package design.decorator.work;

public class Client {
	public static void main(String [] args) {
		Component component, componentMAS, componentJAR, componentLight;
		component = new Phone();
		componentMAS = new SoundDecorator(component);
		componentJAR = new JarDecorator(componentMAS);
		componentLight = new LightDecorator(componentJAR);
		componentLight.CID();
		
	}

}
