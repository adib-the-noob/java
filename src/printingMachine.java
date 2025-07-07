public class printingMachine {
    public static void main(String[] args) {
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 20;
        double height = 304.34;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %.2f\n", height);
    }
}
