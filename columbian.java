import java.util.Random;
import java.util.EnumSet;

class columbian {
    public static void main(String[] args) {
        sumatra sumatraObject = new sumatra(10);
        costarican costaricanObject = new costarican(0, 0, 0);

        for (int i = 0; i < 5; i++) {
            sumatraObject.add();
            System.out.printf("%s", sumatraObject);
        }

        sumatraObject.drink();
        costaricanObject.drink();
    }
}