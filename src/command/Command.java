package command;

/**
 * 命令接口
 * @author Shumao
 * @date 2019/3/1 15:25
 */
public interface Command {
    public void execute();
    public void undo();
}
