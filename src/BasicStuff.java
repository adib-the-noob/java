import java.util.Scanner;

public class BasicStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your gender: ");
        double grade = scanner.nextDouble();

        scanner.close();

        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your grade is " + grade);
    }
}
