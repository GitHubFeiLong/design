package design.builder;
/**
 * HeroBuilder:英雄角色创建者，充当具体建造者
 * @author msi
 * @date 2019年5月20日
 */
public class HeroBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("英雄");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("英俊");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("盔甲");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("飘逸");
	}

}
