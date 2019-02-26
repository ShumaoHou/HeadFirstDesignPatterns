package observer;

import java.util.ArrayList;

/**
 * 天气数据源
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public class WeatherData implements Subject {
    /** 记录观察者 */
    private ArrayList<Observer> observers;
    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 气压 */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i ++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者。
     */
    public void measurementsChanged() {
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

    // 其他方法
}
