package design.builder;
/**
 * AngelBuilder:天使角色创建者，充当具体建造者
 * @author msi
 * @date 2019年5月20日
 */
public class AngelBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("女");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("漂亮");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("白裙");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("披肩长发");
	}

}
