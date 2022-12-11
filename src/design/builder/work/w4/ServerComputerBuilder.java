package design.builder.work.w4;

/**
 * 类描述：
 * 服务器-具体构造者
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:01
 */
public class ServerComputerBuilder extends ComputerBuilder{
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    protected void buildCpu() {
        this.computer.setCpu("安装服务器CPU");
    }

    @Override
    protected void buildMemoryBank() {
        this.computer.setMemoryBank("安装服务器内存条");
    }

    @Override
    protected void buildHardDisk() {
        this.computer.setHardDisk("安装服务器硬盘");
    }

    @Override
    protected void buildMainEngine() {
        this.computer.setMainEngine("安装服务器主机");
    }

    @Override
    protected void buildDisplay() {
        // 服务器主机不需要额外显示器

    }

    /**
     * 服务器不需要显示器
     *
     * @return
     */
    @Override
    protected boolean isNeedDisplay() {
        return false;
    }
}
