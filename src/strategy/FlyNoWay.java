package strategy;

/**
 * 不会飞行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
