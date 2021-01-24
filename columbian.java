import java.util.Random;
import java.util.EnumSet;

class columbian {
    public static void main(String[] args) {
        for (sumatra people : sumatra.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        System.out.println("\nAnd now for the range of constants!!!\n");

        for (sumatra people : EnumSet.range(sumatra.kelsey, sumatra.sruthi))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}