package design.mediator;

/**
 * 组合框类，充当具体同事类
 * @ClassName ComboBox
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 9:16
 */
public class ComboBox extends Component{

	@Override
	public void update() {
		System.out.println("组合框增加一项：张无忌");
	}
	public void select(){
		System.out.println("组合框选中一项：小龙女");
	}
}
