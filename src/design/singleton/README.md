# 单例模式（对象模式-创建型模式）
一个类只有一个实例，且只能是它自己创建这个实例，并且它能提供一个全局访问点来访问这个唯一实例。
## 角色
一个单例类角色，单例类拥有一个**私有构造函数**，一个**私有的成员变量**，一个**公有的工厂方法**(工厂方法，获取单例对象的方法)。

## 单例模式的类型
### 饿汉式单例模式
3个要素：
1. 私有常量单例对象。
2. 私有的构造方法。
3. 公有的获取单例对象方法。

优点：因为定义静态成员变量的时候实例化了单例对象，因此在类加载的时候，单例对象就已经存在。
缺点：即使不使用单例对象，也会创建它，占用了系统资源
java代码示例：
```java
public class Singleton{
    /**
     * 私有常量单例对象
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 私有构造方法
     */
    private Singleton(){}

    /**
     * 公有的获取单例对象方法
     * @return
     */
    public static Singleton getInstance(){return singleton;}
}
```
### 懒汉式单例模式
需要自己处理线程安全问题。
优点：在第一次调用`getInstance()`时候创建单例对象，实现了对象的延迟加载，节省了系统资源。
缺点：在第一次获取单例对象时，才会创建它，如果对象创建时间长，效率会比较低，且需要自己处理多线程问题。
```java
public class Singleton{
    /**
     * 私有静态单例对象，使用volatile修饰（多线程保证可见性）
     */
    private volatile static Singleton singleton = null;
    /**
     * 私有构造方法
     */
    private Singleton(){}
    /**
     * 公有的获取单例对象方法
     * 使用双重检查锁定技术（Double-Check-Locking）
     */
    public static Singleton getInstance(){
        if (singleton == null) {
            synchronized(Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
```
懒汉式单例模式的升级———— **Initialization on Demand Holder**（IoDH）技术
> 结合了饿汉式和懒汉式的优点，缺点就是可能有些语言不支持该方式。
```java
public class Singleton{
    /**
     * 私有构造方法
     */
    private Singleton(){}
    /**
     * 公有的获取单例对象方法
     * @return
     */
    public static Singleton getInstance(){return HolderClass.singleton;}
    
    private static class HolderClass{
        private static final Singleton singleton = new Singleton();
    }
}
```
