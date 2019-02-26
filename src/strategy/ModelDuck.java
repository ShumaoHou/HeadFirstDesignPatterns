package strategy;

/**
 * 模型鸭类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class ModelDuck extends BaseDuck {

    public ModelDuck() {
        // 不会飞
        mFlyBehavior = new FlyNoWay();
        // 会吱吱叫
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
