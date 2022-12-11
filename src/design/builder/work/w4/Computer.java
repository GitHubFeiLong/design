package design.builder.work.w4;

/**
 * 类描述：
 * 电脑产品
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 18:57
 */
public class Computer {
    //~fields
    //==================================================================================================================
    private String cpu;
    private String memoryBank;
    private String hardDisk;
    private String mainEngine;
    private String display;

    //~methods
    //==================================================================================================================

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoryBank() {
        return memoryBank;
    }

    public void setMemoryBank(String memoryBank) {
        this.memoryBank = memoryBank;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMainEngine() {
        return mainEngine;
    }

    public void setMainEngine(String mainEngine) {
        this.mainEngine = mainEngine;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memoryBank='" + memoryBank + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", mainEngine='" + mainEngine + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
