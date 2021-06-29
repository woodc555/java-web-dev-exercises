package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(8);
        arr.add(13);
        arr.add(21);
        arr.add(34);
        arr.add(55);

        System.out.println(arr);

        System.out.println(EvenSum.sumEven(arr));
    }
}
