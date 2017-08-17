/**
 * Created by cris on 2017/8/17.
 */
public class App {

    public static void main(String[] args) {
        Wizzard wizzard = new Wizzard();
        Goblin goblin = new Goblin();


        // wizzard并不知道ShrinkSpell是如何实现的，但是知道有这么个东西
        // 就类似于你不知道敲击键盘发生了什么硬件操作，但是屏幕上出现了你敲击的字符
        // 请求者和执行者之间解耦开了
        wizzard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        wizzard.undoLastSpell();
        goblin.printStatus();

        wizzard.redoLastSpell();
        goblin.printStatus();
    }
}
