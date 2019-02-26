package strategy;

/**
 * 绿头鸭类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class MallardDuck extends BaseDuck {

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
