/**
 * Created by cris on 2017/8/17.
 */
public enum Visibility {
    VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
