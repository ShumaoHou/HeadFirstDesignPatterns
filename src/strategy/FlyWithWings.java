package strategy;

/**
 * 使用翅膀飞行行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
