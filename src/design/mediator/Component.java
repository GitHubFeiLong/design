package design.mediator;

/**
 * 抽象组件类，充当抽象同事类
 * @ClassName Component
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 9:11
 */
public abstract class Component {
	protected Mediator mediator;
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}

	/**
	 * 转发调用
	 */
	public void change(){
		mediator.componentChanged(this);
	}

	public abstract void update();
}
