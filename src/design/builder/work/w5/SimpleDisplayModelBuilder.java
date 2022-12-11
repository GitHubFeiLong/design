package design.builder.work.w5;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:42
 */
public class SimpleDisplayModelBuilder extends DisplayModelBuilder{
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    protected void buildMenu() {
        // 不需要构造菜单
    }

    @Override
    protected void buildPlayList() {
        // 不需要构造构造播放列表
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
    protected boolean isBuildMenu() {
        return false;
    }

    @Override
    protected boolean isBuildPlayList() {
        return false;
    }

    @Override
    protected boolean isBuildFavoriteList() {
        return false;
    }
}
