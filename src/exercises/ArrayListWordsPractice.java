package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWordsPractice {
    public static void main(String[] args){

        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("Kitty");
        wordList.add("Dog");
        wordList.add("Mouse");
        wordList.add("Rat");
        wordList.add("Bird");

        System.out.println(wordList.get(2));
        System.out.println(LengthFiveOnly.onlyFive(wordList));
    }
}
