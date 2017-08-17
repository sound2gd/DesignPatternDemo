/**
 * Created by cris on 2017/8/17.
 */
public abstract class Command {

    abstract void execute(Target target);

    abstract void redo();

    abstract void undo();
}
