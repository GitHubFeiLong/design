package design.mediator;

/**
 * 列表框类，充当具体同时类
 * @ClassName List
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 9:14
 */
public class List extends Component{
	@Override
	public void update() {
		System.out.println("列表框增加一列：张无忌");
	}

	public void select(){
		System.out.println("列表框选中项：小龙女");
	}
}
