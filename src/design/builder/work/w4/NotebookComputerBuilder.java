package design.builder.work.w4;

/**
 * 类描述：
 * 笔记本电脑-具体构造者
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:00
 */
public class NotebookComputerBuilder extends ComputerBuilder{

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    protected void buildCpu() {
        this.computer.setCpu("安装笔记本CPU");
    }

    @Override
    protected void buildMemoryBank() {
        this.computer.setMemoryBank("安装笔记本内存条");
    }

    @Override
    protected void buildHardDisk() {
        this.computer.setHardDisk("安装笔记本硬盘");
    }

    @Override
    protected void buildMainEngine() {
        this.computer.setMainEngine("安装笔记本主机");
    }

    @Override
    protected void buildDisplay() {
        this.computer.setDisplay("安装笔记本显示器");
    }
}
