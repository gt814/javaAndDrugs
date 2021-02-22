import java.util.Objects;

public class SimpleClass {

    private int a;
    private int b;

    public SimpleClass() {
    }

    public SimpleClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClass that = (SimpleClass) o;
        return a == that.a &&
                b == that.b;
    }
}
