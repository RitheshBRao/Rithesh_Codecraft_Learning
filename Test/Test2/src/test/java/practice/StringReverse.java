package practice;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Rithesh B";
        System.out.println();
        char[] strArray = str.toCharArray();
        for (int i = str.length(); i > 0; i--)
        {
            System.out.println(strArray[i-1]);
        }
    }
}
