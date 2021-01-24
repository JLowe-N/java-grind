public class sumatra extends coffee {
    private int sum;
    private final int NUMBER;

    public sumatra(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public void drink() {
        System.out.println("Sumatran coffee just tastes different, thanks to override/overload.");
    }

    public String toString() {
        return String.format("sum = %d\n", sum);
    }
}