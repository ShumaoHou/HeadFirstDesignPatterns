package singleton;

/**
 * 单件模式类
 * @author Shumao
 * @date 2019/2/28 10:49
 */
public class Singleton {
    /**
     * 单件实例
     * volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例时，
     *                    多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton uniqueInstance;

    /**
     * 私有的构造函数
     */
    private Singleton() {    }

    /**
     * 类方法
     * 获得单件实例
     * @return 单件实例对象
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * 输出信息
     */
    public void print() {
        System.out.println("This is a singleton.");
    }
}
