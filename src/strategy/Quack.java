package strategy;

/**
 * 呱呱叫行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
