package design.builder;
/**
 * DevilBuilder:恶魔角色创建者，充当具体建造者
 * @author msi
 * @date 2019年5月20日
 */
public class DevilBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("恶魔");
	}

	
	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("人妖");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("丑陋");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("黑衣斗篷");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("光头");
	}

	/**
	 * 覆盖默认的钩子方法
	 */
	@Override
	public boolean isBareheaded() {
		// TODO Auto-generated method stub
		return true;
	}

}
