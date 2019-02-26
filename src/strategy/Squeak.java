package strategy;

/**
 * 吱吱叫行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
