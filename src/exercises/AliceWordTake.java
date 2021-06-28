package exercises;

import java.util.Scanner;

public class AliceWordTake {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a word: ");
        String wordWritten = scanner.next();

        Integer index = firstSentence.indexOf(wordWritten);
        Integer length = wordWritten.length();
        System.out.println("Your word appears at the index of " + index + ". The length of your word is" + length +".");
        String newSentence = firstSentence.replace(wordWritten, " ");
        System.out.println(newSentence);
    }
}
