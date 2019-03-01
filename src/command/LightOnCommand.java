package command;

/**
 * 打开电灯命令
 * @author Shumao
 * @date 2019/3/1 15:26
 */
public class LightOnCommand implements Command {
    private Light mLight;

    public LightOnCommand(Light light) {
        this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
