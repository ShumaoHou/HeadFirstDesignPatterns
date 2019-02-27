package decorator;

/**
 * @author Shumao
 * @date 2019/2/27 10:38
 */
public class Mocha extends BaseCondimentDecorator {
    /** 实例变量记录饮料，即被装饰者 */
    private BaseBeverage mBeverage;

    /**
     * 构造函数传入被装饰的饮料对象
     * @param beverage 被装饰的饮料对象
     */
    public Mocha(BaseBeverage beverage) {
        this.mBeverage = beverage;
    }

    /**
     * 加入摩卡的描述
     * @return 加入了摩卡的描述
     */
    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    /**
     * 计算带Mocha的价钱
     * @return 带Mocha的价钱
     */
    @Override
    public double cost() {
        return .20 + mBeverage.cost();
    }
}
