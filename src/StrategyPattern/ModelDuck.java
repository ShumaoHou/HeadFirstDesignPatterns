package StrategyPattern;

/**
 * 模型鸭类
 */
public class ModelDuck extends Duck {

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
