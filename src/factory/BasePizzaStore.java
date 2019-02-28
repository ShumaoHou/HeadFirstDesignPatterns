package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:54
 */
public abstract class BasePizzaStore {

    /**
     * 不变的部分
     * 订购Pizza的流程是固定的
     * @param type Pizza类型
     * @return 订购的Pizza
     */
    public BasePizza orderPizza(String type) {
        BasePizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 变化的部分
     * 创建Pizza方法
     * @param type Pizza的类型
     * @return 创建好的Pizza对象
     */
    protected abstract BasePizza createPizza(String type);
}
