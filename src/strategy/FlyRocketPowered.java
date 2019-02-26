package strategy;

/**
 * 火箭动力飞行行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
