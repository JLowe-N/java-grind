import java.util.Random;

class columbian {
    public static void main(String args[]) {
        int firstarray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
        int secondarray[][] = { { 2, 3, 4 }, { 1 }, { 21, 7, 7 } };

        display(firstarray);
        System.out.print("\n\n");
        display(secondarray);
    }

    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.print("\n");
        }
    }
}