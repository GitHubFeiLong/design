package design.prototype.work.w5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 类描述：
 * 原型管理器
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:45
 */
public class PrototypeManager {
    //~fields
    //==================================================================================================================
    private Map<String, Prototype> prototypes;

    private static final PrototypeManager manager = new PrototypeManager(new HashMap<>());
    //~methods
    //==================================================================================================================
    public static PrototypeManager getInstance() {
        return manager;
    }
    private PrototypeManager(Map<String, Prototype> prototypes) {
        this.prototypes = prototypes;
    }

    public void put(String name, Prototype prototype) {
        this.prototypes.put(name, prototype);
    }

    public Prototype get(String name) {
        Prototype prototype = this.prototypes.get(name);
        if (prototype != null) {
            return prototype.copy();
        }
        throw new RuntimeException("原型管理器未管理"+ name);
    }
}
