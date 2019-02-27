package decorator;

/**
 * 饮料抽象超类
 * @author Shumao
 * @date 2019/2/27 10:19
 */
public abstract class BaseBeverage {
    /** 饮料描述 */
    private String description = "Unknown Beverage";

    /**
     * 设置饮料描述
     * @param description 饮料描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取饮料描述
     * @return 饮料描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 计算饮料价格
     * @return 饮料价格
     */
    public abstract double cost();
}
