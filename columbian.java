import java.util.Random;

class columbian {
    public static void main(String[] args) {
        sumatra sumatraObject = new sumatra();
        sumatra sumatraObject2 = new sumatra(5);
        sumatra sumatraObject3 = new sumatra(5, 13);
        sumatra sumatraObject4 = new sumatra(5, 13, 43);

        System.out.printf("%s\n", sumatraObject.toMilitary());
        System.out.printf("%s\n", sumatraObject2.toMilitary());
        System.out.printf("%s\n", sumatraObject3.toMilitary());
        System.out.printf("%s\n", sumatraObject4.toMilitary());
    }
}