package design.prototype.work.w4;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:31
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) throws CloneNotSupportedException {
        Data data = new Data(5, new Integer[]{1, 2, 3, 4, 5});
        DataChart chart1 = new DataChart("1", "绿色", data);
        System.out.println("chart1 = " + chart1);
        // 复制
        DataChart chart2 = chart1.clone();
        System.out.println("chart2 = " + chart2);
        // 修改引用成员变量
        Data data2 = new Data(3, new Integer[]{10, 20 , 30});
        chart2.setData(data2);

        // 查看修改后的
        System.out.println("修改后======");
        System.out.println("chart1 = " + chart1);
        System.out.println("chart2 = " + chart2);
    }
}
