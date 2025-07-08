public class SwitchStuff {
    public static void main(String[] args) {
        String day = "sat";
        switch (day) {
            case "sat" -> System.out.println("This is Saturday!");
            case "sunday" -> System.out.println("This is Sunday!");
            case "monday" -> System.out.println("This is Monday!");
            case "tuesday" -> System.out.println("This is Tuesday!");
        }
    }
}
