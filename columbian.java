import java.util.Random;

class columbian {
    public static void main(String args[]) {
        Random dice = new Random();
        
        for (int counter = 1; counter <= 10; counter++) {
            int number;

            number = 1 + dice.nextInt(6);
            System.out.println("number " + number);
        }
    }
}