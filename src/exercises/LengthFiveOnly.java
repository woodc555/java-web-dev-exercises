package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthFiveOnly {
    public static ArrayList<String> onlyFive(ArrayList<String> wordList){
        int charNum;

        Scanner input = new Scanner(System.in);
        System.out.println("Please select the characters: ");
        charNum = (int) input.nextDouble();

        ArrayList wordLength = new ArrayList<String>();
        for (int i = 0; i <= 4; i++){
            if(wordList.get(i).length() == charNum) {
                wordLength.add(wordList.get(i));
            }
        }
        return wordLength;
    }
}
