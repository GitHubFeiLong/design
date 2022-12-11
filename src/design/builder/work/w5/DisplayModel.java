package design.builder.work.w5;

import java.util.List;

/**
 * 类描述：
 * 显示模式-复杂产品对象
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:36
 */
public class DisplayModel {
    //~fields
    //==================================================================================================================
    private String menu;
    private List<String> playList;
    private String mainWindow;
    private String controllerItem;
    private List<String> favoriteList;
    //~methods
    //==================================================================================================================

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public List<String> getPlayList() {
        return playList;
    }

    public void setPlayList(List<String> playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControllerItem() {
        return controllerItem;
    }

    public void setControllerItem(String controllerItem) {
        this.controllerItem = controllerItem;
    }

    public List<String> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<String> favoriteList) {
        this.favoriteList = favoriteList;
    }

    @Override
    public String toString() {
        return "DisplayModel{" +
                "menu='" + menu + '\'' +
                ", playList=" + playList +
                ", mainWindow='" + mainWindow + '\'' +
                ", controllerItem='" + controllerItem + '\'' +
                ", favoriteList=" + favoriteList +
                '}';
    }
}
