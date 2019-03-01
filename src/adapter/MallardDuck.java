package adapter;

/**
 * @author Shumao
 * @date 2019/3/1 17:18
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
