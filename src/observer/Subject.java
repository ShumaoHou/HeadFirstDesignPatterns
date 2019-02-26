package observer;

/**
 * 主题接口
 * @author Shumao
 * @date 2019/2/26 10:03
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o 观察者对象
     */
    public void registerObserver (Observer o);

    /**
     * 删除观察者
     * @param o 观察者对象
     */
    public void removeObserver (Observer o);

    /**
     * 主题状态改变时，通知观察者
     */
    public void notifyObservers ();
}

