package command;

/**
 * 简单遥控器类
 * @author Shumao
 * @date 2019/3/1 15:29
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
