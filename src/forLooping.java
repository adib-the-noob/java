public class forLooping {
    public static void main(String[] args){
//        for (int i=0;i<5;i++){
//            System.out.println("KireMama!");
//        }
        double res = square_res(2);
        double cub = cubes(2);
        System.out.println(res);
        System.out.println(cub);

        happyBirthday("Adib");
    }

    static void happyBirthday(String name){
        System.out.printf("Happy Birthday, %s!\n", name);
        System.out.printf("Hello, %s!\n", name);
    }

    static double square_res(double x){
        return x * x;
    }

    static double cubes(double x){
        return x * x * x;
    }
}
