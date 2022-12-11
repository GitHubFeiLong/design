package design.builder.work.w5;

/**
 * 类描述：
 * 显示模式的抽象构造者
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:38
 */
public abstract class DisplayModelBuilder {
    //~fields
    //==================================================================================================================
    DisplayModel displayModel = new DisplayModel();

    //~methods
    //==================================================================================================================
    protected abstract void buildMenu();
    protected abstract void buildPlayList();
    protected abstract void buildMainWindow();
    protected abstract void buildControllerItem();
    protected abstract void buildFavoriteList();
    protected boolean isBuildMenu(){
        return true;
    }
    protected boolean isBuildPlayList(){
        return true;
    }
    protected boolean isBuildFavoriteList(){
        return true;
    }

    public DisplayModel createDisplayModel() {
        return this.displayModel;
    }
}
