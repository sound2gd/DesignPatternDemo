/**
 * Created by cris on 2017/8/17.
 */
public class Target {

    private Size size;

    private Visibility visibility;

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void printStatus() {
        final StringBuilder sb = new StringBuilder(this.getClass().getName() + "{");
        sb.append("size=").append(size);
        sb.append(", visibility=").append(visibility);
        sb.append('}');
        System.out.println(sb);
    }
}
