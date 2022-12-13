package design.singleton.work.w8;

import java.util.*;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/13 21:59
 */
public class DatabasePool {
    //~fields
    //==================================================================================================================
    private static final DatabasePool pool = new DatabasePool();

    private List<Connector> connectors;
    //~methods
    //==================================================================================================================

    public static DatabasePool getInstance() {
        return DatabasePool.pool;
    }

    private DatabasePool() {
        connectors = new ArrayList<>();
        Connector connector1 = new Connector("127.0.0.1", 3306, "root", "password", "1");
        Connector connector2 = connector1.clone();
        connector2.setInfo("2");
        Connector connector3 = connector1.clone();
        connector3.setInfo("3");
        connectors.add(connector1);
        connectors.add(connector2);
        connectors.add(connector3);
    }

    public Connector getConnector() {
        int index = new Random().nextInt(connectors.size());
        return connectors.get(index);
    }

}

