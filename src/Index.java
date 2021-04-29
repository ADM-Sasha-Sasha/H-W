public class Index {
    private int first;
    private String name;

    public int getFirst() {
        return first;
    }

    public String getName() {
        return name;
    }

    public Index(int first, String name) {
        this.first = first;
        this.name = name;
    }

    @Override
    public String toString() {
        return first + "." + name;
    }
}
