package Array;

import java.util.Scanner;

public class Palindrome {

    public boolean checkPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int startIndex = 0;
        int endIndex = word.length() - 1;
        while (startIndex < endIndex) {
            if (charArray[startIndex] != charArray[endIndex]) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter the Word here to check:");
        Scanner input = new Scanner(System.in);
        String myWord = input.next();
        input.close();

        Palindrome checkWord = new Palindrome();
        boolean result = checkWord.checkPalindrome(myWord);
        System.out.println(result);
    }
}