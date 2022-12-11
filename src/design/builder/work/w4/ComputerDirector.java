package design.builder.work.w4;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:06
 */
public class ComputerDirector {
    //~fields
    //==================================================================================================================
    private ComputerBuilder computerBuilder;

    //~methods
    //==================================================================================================================

    public ComputerDirector() {
    }

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer construct() {
        this.computerBuilder.buildMainEngine();
        this.computerBuilder.buildCpu();
        this.computerBuilder.buildMemoryBank();
        this.computerBuilder.buildHardDisk();

        if (this.computerBuilder.isNeedDisplay()) {
            this.computerBuilder.buildDisplay();
        }
        return this.computerBuilder.createComputer();
    }
}
