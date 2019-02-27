package decorator;

/**
 * @author Shumao
 * @date 2019/2/27 10:43
 */
public class Soy extends BaseCondimentDecorator {
    /** 实例变量记录饮料，即被装饰者 */
    private BaseBeverage mBeverage;

    /**
     * 构造函数传入被装饰的饮料对象
     * @param beverage 被装饰的饮料对象
     */
    public Soy(BaseBeverage beverage) {
        this.mBeverage = beverage;
    }

    /**
     * 加入Soy的描述
     * @return 加入了Soy的描述
     */
    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Soy";
    }

    /**
     * 计算带Soy的价钱
     * @return 带Soy的价钱
     */
    @Override
    public double cost() {
        return .30 + mBeverage.cost();
    }
}
