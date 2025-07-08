package Intermediate;

public class methodOverloading {
    public static void main(String[] args) {
        double res1 = add(1, 2);
        System.out.println(res1);
        double res2 = add(1, 2, 3);
        System.out.println(res2);
    }

    static double add(double a, double b){
        return a+b;
    }

    static double add(double a, double b, double c){
        return a+b+c;
    }
}
