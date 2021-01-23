import java.util.Scanner;

class columbian {
    public static void main(String args[]) {
        int age = 110;

        if (age < 50) {
            System.out.println("You are young.");
        } else if (age >= 50) {
            System.out.println("You have experience.");
            if (age > 75 || age <= 100) {
                System.out.println("You have wisdom.");
            } else {
                System.out.println("You are somewhere in between.");
            }
        } else {
            System.out.println("Wow, I didn't expect that age!");
        }

    }
}