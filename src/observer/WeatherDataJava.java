package observer;

import java.util.Observable;

/**
 * 天气数据源-Java内置观察者模式
 * @author Shumao
 * @date 2019/2/26 11:03
 */
public class WeatherDataJava extends Observable {
    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 气压 */
    private float pressure;

    public WeatherDataJava() {}

    /**
     * 当从气象站得到更新观测值时，我们通知观察者。
     */
    public void measurementsChanged() {
        // 指示状态已经改变(changed = true)，以便notifyObservers()通知观察者调用update()更新数据
        setChanged();
        notifyObservers();
    }

    /**
     * 设置新的观测值
     * @param temperature 新的温度
     * @param humidity 新的湿度
     * @param pressure 新的气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
