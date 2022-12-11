package design.builder.work.w5;

/**
 * 类描述：
 * 指挥者类
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:46
 */
public class DisplayModelDirector {
    //~fields
    //==================================================================================================================
    private DisplayModelBuilder displayModelBuilder;

    public DisplayModelDirector(DisplayModelBuilder displayModelBuilder) {
        this.displayModelBuilder = displayModelBuilder;
    }

    //~methods
    //==================================================================================================================
    public DisplayModel construct() {
        displayModelBuilder.buildMainWindow();
        if (displayModelBuilder.isBuildMenu()) {
            displayModelBuilder.buildMenu();
        }
        if (displayModelBuilder.isBuildPlayList()) {
            displayModelBuilder.buildPlayList();
        }

        displayModelBuilder.buildControllerItem();

        if (displayModelBuilder.isBuildFavoriteList()) {
            displayModelBuilder.buildFavoriteList();
        }

        return displayModelBuilder.createDisplayModel();
    }
}
