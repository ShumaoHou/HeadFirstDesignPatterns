package observer;

/**
 * 目前状况布告板
 * @author Shumao
 * @date 2019/2/26 10:38
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 主题对象 */
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
