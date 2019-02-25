package StrategyPattern;

/**
 * 吱吱叫行为类
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
