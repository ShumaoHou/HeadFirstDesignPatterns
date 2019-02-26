package observer;

/**
 * 观察者接口
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public interface Observer {
    /**
     * 供主题调用
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure);
}
