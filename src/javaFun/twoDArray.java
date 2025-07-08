package javaFun;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        String[] fruites = {"apple", "banana", "orabge"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"beef", "chicken", "mutton"};

        String[][] groceries = {fruites, vegetables, meats};
        for (String[] food: groceries) {
            for (String foodName: food) {
                System.out.println(foodName);
            }
            System.out.println("======");
        }
    }
}
