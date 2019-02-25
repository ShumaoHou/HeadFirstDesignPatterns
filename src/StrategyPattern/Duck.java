package StrategyPattern;

/**
 * 鸭子抽象类
 */
public abstract class Duck {

    // 飞行行为
    FlyBehavior mFlyBehavior;
    // 叫声行为
    QuackBehavior mQuackBehavior;

    public Duck() {

    }

    /**
     * 每个Duck的外观方法
     */
    public abstract void display();

    /**
     * 进行游泳行为
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 进行飞行行为
     */
    public void performFly() {
        // 委托给行为类
        mFlyBehavior.fly();
    }

    /**
     * 进行叫声行为
     */
    public void performQuack() {
        // 委托给行为类
        mQuackBehavior.quack();
    }

    /**
     * 设定飞行行为
     * @param fb 飞行行为
     */
    public void setFlyBehavior(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    /**
     * 设定叫声行为
     * @param qb 叫声行为
     */
    public void setQuackBehavior(QuackBehavior qb) {
        mQuackBehavior = qb;
    }
}
