package design.builder.work.w4;

/**
 * 类描述：
 * 台式机-具体构造者
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:00
 */
public class DesktopComputerBuilder extends ComputerBuilder{
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    protected void buildCpu() {
        this.computer.setCpu("安装台式机CPU");
    }

    @Override
    protected void buildMemoryBank() {
        this.computer.setMemoryBank("安装台式机内存条");
    }

    @Override
    protected void buildHardDisk() {
        this.computer.setHardDisk("安装台式机硬盘");
    }

    @Override
    protected void buildMainEngine() {
        this.computer.setMainEngine("安装台式机主机");
    }

    @Override
    protected void buildDisplay() {
        this.computer.setDisplay("安装台式机显示器");
    }
}
