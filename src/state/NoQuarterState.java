package state;

/**
 * 没有投入25分钱，有库存
 * 状态类
 * @author Shumao
 * @date 2019/3/2 16:14
 */
public class NoQuarterState implements State {
    private GumballMachine mGumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25分钱");
        mGumballMachine.setState(mGumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没有投入25分钱，无法退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了，但是你没给钱");
    }

    @Override
    public void dispense() {
        System.out.println("你需要先付钱");
    }
}
