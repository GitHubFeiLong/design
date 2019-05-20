package design.builder;
/**
 * ActorController：角色控制器，充当指挥者
 * @author msi
 * @date 2019年5月20日
 */
public class ActorController {
	
	// 逐步构建复杂产品对象
	public Actor construct(ActorBuilder builder) {
		Actor actor;
		builder.buildType();
		builder.buildSex();
		builder.buildFace();
		builder.buildCostume();
//		builder.buildHairstyle();
		// 通过钩子方法来控制产品的构建
		if (!builder.isBareheaded()) {
			builder.buildHairstyle();
		}
		actor = builder.createActor();
		return actor;
	}

}
