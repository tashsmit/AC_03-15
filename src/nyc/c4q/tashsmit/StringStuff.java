package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/15/15.
 */
import java.util.Scanner;
public class StringStuff {

    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        String someStr;
        String someChar;

        System.out.println("Enter a string: ");
        someStr = input.nextLine();
        System.out.println("Enter a character: ");
        someChar = input.nextLine();
        char charVar = someChar.charAt(0);
        charCount(someStr, charVar);*/

        pad("abc", 10, '*');

    }


    public static void printReverse(String text) {

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void charCount(String text, char letter) {

        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                wordCount++;
            } else
                continue;
        }

        System.out.println(wordCount);

    }

    /*public static void main(String[] args){

        String text = "Hello, World!";


        for (int i = 1; i < text.length(); i= i +2 ) {
            if (text.length() % 2 == 1) {
                text = text + " ";
            }

            System.out.print(text.charAt(i));
            System.out.print(text.charAt(i - 1));
        }
    }*/

    public static void Underline(String text) {

        System.out.println(text);

        for (int i = 0; i < text.length(); i++) {
            System.out.print("=");
        }

    }

    public static void pad(String text, int length, char padChar) {

        int difference = length - text.length();

        System.out.print(text);

        for (int i = 0; i < difference; i++) {

            System.out.print(padChar);

        }


    }
}
