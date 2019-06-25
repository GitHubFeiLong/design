package design.state.work;

/**
 * 环境类
 * @ClassName Screen
 * @Description TODO
 * @Author msi
 * @Date 2019/6/25 20:17
 */
public class Screen {
	// 枚举所有状态：currentState表示当前状态
	private ScreenState currentState, normalState,largerState, largestState;

	public Screen() {
		this.normalState = new NormalState();
		this.largerState = new LargerState();
		this.largestState = new LargestState();
		this.currentState = normalState;
		this.currentState.display();
	}

	public void setState(ScreenState state){
		this.currentState = state;
	}

	// 点击事件处理方法，封装了对状态类中业务方法的调用和状态的转换
	public void onClick(){
		if(this.currentState == normalState){
			setState(largerState);
			this.currentState.display();
		} else if (this.currentState == largerState){
			setState(largestState);
			this.currentState.display();
		} else if(this.currentState == largestState){
			setState(normalState);
			this.currentState.display();
		}
	}

}
