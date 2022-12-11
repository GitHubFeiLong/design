package design.builder.work.w5;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:41
 */
public class FullDisplayModelBuilder extends DisplayModelBuilder{

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    protected void buildMenu() {
        System.out.println("构造菜单");
    }

    @Override
    protected void buildPlayList() {
        System.out.println("构造播放列表");
    }

    @Override
    protected void buildMainWindow() {
        System.out.println("构造主窗口");
    }

    @Override
    protected void buildControllerItem() {
        System.out.println("构造控制条");
    }

    @Override
    protected void buildFavoriteList() {
        // 不需要构造收藏列表
    }

    @Override
    protected boolean isBuildFavoriteList() {
        return false;
    }
}
