package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/15/15.
 */
public class StringBox {

    public static void main(String[] args) {
        stringBox("Hello, world!");
    }

    public static void stringBox(String text) {
        String startEnd = "+-";

        for (int i = 0; i < text.length(); i++) {
            startEnd += "-";
        }

        System.out.println(startEnd + "-+");
        System.out.println("| " + text + " |");

        System.out.print(startEnd + "-+");
    }
}
