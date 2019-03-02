package state;

/**
 * @author Shumao
 * @date 2019/3/2 15:47
 */
public class GumballMachine {
    /** 糖果已售罄 */
    private State soldOutState;
    /** 没有投入25分 */
    private State noQuarterState;
    /** 已投入25分 */
    private State hasQuarterState;
    /** 已售出 */
    private State soldState;
    /** 获胜者状态 */
    private State winnnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int num) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = num;
        if (num > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("糖果来啦.");
        if (count != 0){
            count --;
        }
    }

    @Override
    public String toString() {
        return "Gumball count:" + count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnnerState() {
        return winnnerState;
    }

    public void setWinnnerState(State winnnerState) {
        this.winnnerState = winnnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
