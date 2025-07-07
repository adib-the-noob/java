import java.util.Scanner;

public class conditionStuff {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (name.isEmpty()) {
            System.out.println("You need to enter a name");
        }

        if (age < 18) {
            System.out.println("You are too low");
        }  else if (age > 18 && age < 25) {
            System.out.println("You are too high");
        } else {
            System.out.println("You are too much");
        }
    }
}
