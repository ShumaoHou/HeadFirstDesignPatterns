package command;

/**
 * @author Shumao
 * @date 2019/3/1 16:10
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // 什么也不做
    }

    @Override
    public void undo() {

    }
}
