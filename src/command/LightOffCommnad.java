package command;

/**
 * @author Shumao
 * @date 2019/3/1 16:25
 */
public class LightOffCommnad implements Command {
    private Light mLight;

    public LightOffCommnad(Light light) {
        this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.on();
    }
}
