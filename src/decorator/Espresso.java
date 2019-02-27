package decorator;

/**
 * @author Shumao
 * @date 2019/2/27 10:26
 */
public class Espresso extends BaseBeverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
