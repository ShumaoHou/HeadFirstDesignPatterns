package command;

/**
 * 遥控器控制类
 * @author Shumao
 * @date 2019/3/1 16:07
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i ++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 设置遥控命令
     * @param slot 位置
     * @param onCommand 开启命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 开启命令按下操作
     * @param slot  位置
     */
    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * 关闭命令按下操作
     * @param slot 位置
     */
    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------Remote Control---------\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
