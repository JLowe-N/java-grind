import java.util.Random;
import java.util.EnumSet;

class columbian {
    public static void main(String[] args) {
        sumatra member1 = new sumatra("Megan", "Fox");
        sumatra member2 = new sumatra("Natalie", "Portman");
        sumatra member3 = new sumatra("Taylor", "Swift");

        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(sumatra.getMembers());
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
    }
}