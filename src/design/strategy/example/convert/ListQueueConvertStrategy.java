package design.strategy.example.convert;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 16:17
 */
public class ListQueueConvertStrategy implements QueueConvertStrategy<List>{

    /**
     * 行列转换
     * @param data 待行列转换的数据
     * @return
     */
    @Override
    public List convert(List data) {
        if (data == null || data.isEmpty()) {
            return data;
        }

        // 原集合的列长度
        final int columnSize = ((List)(data.get(0))).size();

        // 声明转换后的结果行集合
        List<List> convertedRows = new ArrayList<>(columnSize);

        /*
            循环列
        */
        Stream.iterate(0, j -> j+1).limit(columnSize).forEach(j -> {
            // data的第j列数据扁平化
            List collect = (List) data.stream()
                    .map(m -> ((List)m).get(j))
                    .collect(Collectors.toList());

            convertedRows.add(collect);
        });


        return convertedRows;
    }
}
