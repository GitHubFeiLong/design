package design.adapter;

/**
 * 适配器类
 * @author msi
 * @date 2019年6月3日
 */
public class PoliceCarAdapter extends CarController{

	private PoliceSound sound;
	private PoliceLamp lamp;
	
	// 初始化适配者类
	public  PoliceCarAdapter() {
		this.sound = new PoliceSound();
		this.lamp = new PoliceLamp();
	}
	
	// 发出警笛声
	@Override
	public void phonate() {
		// TODO Auto-generated method stub
		sound.alarmSound();
	}

	// 呈现警灯闪烁
	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		lamp.alarmLamp();
	}

}
