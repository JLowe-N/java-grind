import java.util.Scanner;

class apples {
    public static void main(String args[]) {
        Scanner justin = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = justin.nextDouble();
        System.out.println("Enter second num: ");
        snum = justin.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}