import java.util.Scanner;

public class loopStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.println("Please enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
