package Template;

/**
 * @author Shumao
 * @date 2019/3/2 14:34
 */
public class Duck implements Comparable {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck other = (Duck) o;
        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight > other.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
