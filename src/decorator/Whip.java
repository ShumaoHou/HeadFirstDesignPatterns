package decorator;

/**
 * @author Shumao
 * @date 2019/2/27 10:43
 */
public class Whip extends BaseCondimentDecorator {
    /** 实例变量记录饮料，即被装饰者 */
    private BaseBeverage mBeverage;

    /**
     * 构造函数传入被装饰的饮料对象
     * @param beverage 被装饰的饮料对象
     */
    public Whip(BaseBeverage beverage) {
        this.mBeverage = beverage;
    }

    /**
     * 加入Whip的描述
     * @return 加入了Whip的描述
     */
    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Whip";
    }

    /**
     * 计算带Whip的价钱
     * @return 带Whip的价钱
     */
    @Override
    public double cost() {
        return .10 + mBeverage.cost();
    }
}
