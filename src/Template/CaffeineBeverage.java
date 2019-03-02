package Template;

/**
 * @author Shumao
 * @date 2019/3/2 10:57
 */
public abstract class CaffeineBeverage {

    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (custom()) {
            addCondiments();
        }
    }

    /**
     * 冲泡饮料
     */
    abstract void brew();

    /**
     * 加入调料
     */
    abstract void addCondiments();

    /**
     * 烧水
     */
    void boilWater() {
        System.out.println("Boiling Water");
    }

    /**
     * 将饮料倒入杯中
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子函数
     * @return
     */
    public boolean custom() {
        return true;
    }
}
