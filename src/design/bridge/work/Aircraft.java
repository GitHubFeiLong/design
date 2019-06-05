package design.bridge.work;

public abstract class Aircraft {
	protected ManufacturerImp imp;
	public void setImp(ManufacturerImp imp) {
		this.imp = imp;
	}
	
	public abstract void doSomething();

}
