import java.util.Scanner;

class columbian {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        sumatra sumatraObject = new sumatra();

        System.out.println("Enter your favorite person's name here: ");
        String temp = input.nextLine();
        sumatraObject.setName(temp);
        sumatraObject.saying();

        }
}