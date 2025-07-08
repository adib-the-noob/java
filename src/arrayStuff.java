import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayStuff {
    public static void main(String[] args) {
        String[] fruites = {
                "apple",
                "orange",
                "pear"
        };
        System.out.println("Fruite Array" + Arrays.toString(fruites));

        // method 01
        fruites[0] = "appleMacbook";
        for (int i = 0; i < fruites.length; i++) {
            System.out.println(fruites[i]);
        }
        System.out.println("================================");


        // method 02
        for (String fruite : fruites) {
            System.out.println(fruite);
        }

        // more methods

    }
}
