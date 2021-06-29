package exercises;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args){
        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] drSuessArray = drSuess.split(" ");

        System.out.println(Arrays.toString(drSuessArray));

        String[] drSuessArray2 = drSuess.split("\\.");

        System.out.println(Arrays.toString(drSuessArray2));
    }
}
