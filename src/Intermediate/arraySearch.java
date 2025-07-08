package Intermediate;

import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        int targetItem = 2;
        int[] db_array  = {1, 2, 3, 4, 5};
        for (int i = 0; i<db_array.length; i++){
            if (db_array[i] == targetItem){
                System.out.println("got the iteam!");
                break;
            }
        }
    }
}
