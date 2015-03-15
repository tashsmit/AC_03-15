package nyc.c4q.tashsmit;

public class Main {

    public static void main(String[] args) {

        //String [] myArray = {};
        String someStr = "MYCATATAA";
        String anotherStr = "MYDOG";

        //String newStr = someStr.replace(someStr.charAt(0), someStr.charAt(1));
        int sample = someStr.lastIndexOf("TA");
        System.out.println(sample);

        char [] chrArr = someStr.toCharArray();

        for (int i = 0; i < chrArr.length; i++)
            System.out.println(chrArr[i]);

        //System.out.println(myArray);
    }
}
