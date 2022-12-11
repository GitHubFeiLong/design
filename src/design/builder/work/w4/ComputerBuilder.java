package design.builder.work.w4;

/**
 * 类描述：
 * 电脑抽象构造者
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 18:57
 */
public abstract class ComputerBuilder {
    //~fields
    //==================================================================================================================
    protected Computer computer = new Computer();

    //~methods
    //==================================================================================================================
    protected abstract void buildCpu();
    protected abstract void buildMemoryBank();
    protected abstract void buildHardDisk();
    protected abstract void buildMainEngine();
    protected abstract void buildDisplay();

    /**
     * 默认需要显示器
     * @return
     */
    protected boolean isNeedDisplay() {
        return true;
    }

    public Computer createComputer() {
        return this.computer;
    };
}
