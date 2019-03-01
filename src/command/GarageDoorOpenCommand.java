package command;

/**
 * @author Shumao
 * @date 2019/3/1 15:51
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor mDoor;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.mDoor = door;
    }

    @Override
    public void execute() {
        mDoor.up();
    }

    @Override
    public void undo() {
        mDoor.down();
    }
}
