package Template;

/**
 * @author Shumao
 * @date 2019/3/2 10:56
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean custom() {
        return false;
    }
}
