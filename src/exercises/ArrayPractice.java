package exercises;

public class ArrayPractice {
    public static void main(String[] args){
        int maxLength = 5;

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i <= maxLength; i++) {
            if (integerArray[i] % 2 == 0) {

            } else {
                System.out.println(integerArray[i]);
            }
        }
    }
}
