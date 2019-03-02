package state;

import java.util.Random;

/**
 * 投入25分钱，有库存
 * 状态类
 * @author Shumao
 * @date 2019/3/2 16:14
 */
public class HasQuarterState implements State {
    private GumballMachine mGumballMachine;
    Random mRandom = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投入25分钱，请勿重复投入");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("投入的钱已退出");
        mGumballMachine.setState(mGumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄：");
        int winner = mRandom.nextInt(10);
        if ((winner == 0) && (mGumballMachine.getCount() > 1)){
            mGumballMachine.setState(mGumballMachine.getWinnnerState());
        } else {
            mGumballMachine.setState(mGumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("无糖果可发放");
    }
}
