package state;

/**
 * 产品售罄状态类
 * @author Shumao
 * @date 2019/3/2 16:15
 */
public class SoldOutState implements State {
    private GumballMachine mGumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已售罄");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果已售罄");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已售罄");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已售罄");
    }
}
