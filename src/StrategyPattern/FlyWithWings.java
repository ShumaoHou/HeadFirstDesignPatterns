package StrategyPattern;

/**
 * 使用翅膀飞行行为类
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
