package state;

/**
 * 获胜者状态类
 * @author Shumao
 * @date 2019/3/2 16:15
 */
public class WinnerState implements State {
    private GumballMachine mGumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("你是获胜者！恭喜你！");
        // 先释放第一颗
        mGumballMachine.releaseBall();
        if (mGumballMachine.getCount() == 0) {
            // 没有糖果
            System.out.println("糖果已售罄");
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        } else {
            // 还有糖果，则释放第二颗
            mGumballMachine.releaseBall();
            if (mGumballMachine.getCount() > 0) {
                mGumballMachine.setState(mGumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖果已售罄");
                mGumballMachine.setState(mGumballMachine.getSoldOutState());
            }
        }
    }
}
