import java.util.Random;

public class randomNumbers {
    public static void main (String[] args) {
        Random random = new Random();

        int number;
        number = random.nextInt(6)+1;
        System.out.println("The random number is: " + number);
    }
}
