import java.util.Random;

class columbian {
    public static void main(String args[]) {
        System.out.println("Index\tValue");
        int justin[]={32,12,18,54,2};
        int sum=0;

        for (int counter=0; counter<justin.length; counter++) {
            sum += justin[counter];
            System.out.println(counter + "\t" + justin[counter]);
        }

        System.out.println("Sum is " + sum);

    }
}