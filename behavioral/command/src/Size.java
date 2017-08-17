/**
 * Created by cris on 2017/8/17.
 */
public enum Size {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large")
    ;

    private String title;

    Size(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Size{");
        sb.append("title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
