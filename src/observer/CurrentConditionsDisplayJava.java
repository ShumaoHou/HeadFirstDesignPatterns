package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况布告板-Java内置观察者模式
 * @author Shumao
 * @date 2019/2/26 10:38
 */
public class CurrentConditionsDisplayJava implements Observer, DisplayElement{
    Observable mObservable;
    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 主题对象 */
    private Subject weatherData;

    public CurrentConditionsDisplayJava(Observable observable) {
        this.mObservable = observable;
        // 注册观察者
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataJava) {
            WeatherDataJava weatherDataJava = (WeatherDataJava)obs;
            // 拉取数据
            this.temperature = weatherDataJava.getTemperature();
            this.humidity = weatherDataJava.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
