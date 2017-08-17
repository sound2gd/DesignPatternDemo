import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 巫师类，用于发出命令
 *
 * Created by cris on 2017/8/17.
 */
public class Wizzard {

    // 本类记录了undo和redo日志，不知道这样合不合适
    private Deque<Command> redoStack = new ArrayDeque<>();

    private Deque<Command> undoStack = new ArrayDeque<>();

    /**
     * 发起Command请求到Target
     * @param command
     * @param target
     */
    public void castSpell(Command command,Target target){
        // 封装好的算法
        command.execute(target);
        // 记录undo日志
        undoStack.offerLast(command);
    }

    /**
     * 重新发起上次的spell
     */
    public void redoLastSpell(){
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pollLast();
            command.redo();

            undoStack.offerLast(command);
        }
    }

    /**
     * 取消上次的spell
     */
    public void undoLastSpell(){
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pollLast();
            command.undo();

            redoStack.offerLast(command);
        }
    }


}
