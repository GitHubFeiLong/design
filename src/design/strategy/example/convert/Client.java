package design.strategy.example.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 16:19
 */
public class Client {
    public static void main(String[] args) throws NoSuchFieldException {
        // 创建行列数据
        List<List<Cell>> queue = new ArrayList<>();
        // 3 行 4列
        for (int i = 1; i <= 3; i++) {
            List<Cell> rows = new ArrayList<>();
            for (int j = 1; j <= 4; j++) {
                rows.add(new Cell(i, j, String.format("原%d行%d列",i,j)));
            }

            queue.add(rows);
        }

        System.out.println("queue = " + queue);

        // 开始转换
        Context<List> context = new Context();
        context.setQueueConvertStrategy(new ListQueueConvertStrategy());
        List execute = new ArrayList<>(context.execute(queue));
        System.out.println("execute = " + execute);
    }
}
