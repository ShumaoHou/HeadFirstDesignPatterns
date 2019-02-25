package StrategyPattern;

/**
 * 绿头鸭类
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // 会飞
        mFlyBehavior = new FlyWithWings();
        // 会呱呱叫
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
