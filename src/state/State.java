package state;

/**
 * @author Shumao
 * @date 2019/3/2 16:12
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
