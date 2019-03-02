package state;

/**
 * 产品已卖出
 * 状态类
 * @author Shumao
 * @date 2019/3/2 16:15
 */
public class SoldState implements State {
    private GumballMachine mGumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("请等待，我们正在给你发放");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("对不起，你已经转动过曲柄");
    }

    @Override
    public void turnCrank() {
        System.out.println("请不要重复转动");
    }

    @Override
    public void dispense() {
        mGumballMachine.releaseBall();
        if (mGumballMachine.getCount() > 0) {
            mGumballMachine.setState(mGumballMachine.getNoQuarterState());
        } else {
            System.out.println("糖果已售罄");
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        }
    }
}
