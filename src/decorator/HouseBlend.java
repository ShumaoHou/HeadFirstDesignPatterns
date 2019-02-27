package decorator;

/**
 * @author Shumao
 * @date 2019/2/27 10:37
 */
public class HouseBlend extends BaseBeverage {

    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
