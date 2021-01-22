import java.util.Scanner;

class columbian {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        sumatra sumatraObject = new sumatra();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        sumatraObject.simpleMessage(name);

    }
}