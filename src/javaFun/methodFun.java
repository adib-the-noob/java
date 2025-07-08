package javaFun;

public class methodFun {
    public static void main(String[] args) {
        addAllNumbers(1, 2, 3, 4);
    }

    public static void addAllNumbers(int ...numbers){
        System.out.println(numbers);
        int sum = 0;
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(sum += numbers[i]);
//        }
        for (int number : numbers){
            sum += number;
        }
        System.out.println("sum is " + sum);
    }
}
