/**
 * 缩小咒语
 * Created by cris on 2017/8/17.
 */
public class ShrinkSpell extends Command{

    // 保存了对象的状态
    private Size oldSize;

    private Target target;

    @Override
    void execute(Target target) {
        this.target = target;

        oldSize = target.getSize();
        target.setSize(Size.SMALL);
    }

    @Override
    void redo() {
        undo();
    }

    @Override
    void undo() {
        if (oldSize != null && target != null) {
            Size size = target.getSize();
            target.setSize(oldSize);
            oldSize = size;
        }
    }
}
