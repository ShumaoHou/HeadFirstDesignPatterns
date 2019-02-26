package strategy;

/**
 * 安静行为类
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
