package practice;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("hi");

        String str = "rithesh";
        String str1 = "_b_rao";
        StringBuffer buffer = new StringBuffer(str1);
        StringBuilder builder1 = new StringBuilder(str1);

//        String str3 = str.concat(str1);
//
//        System.out.println((str.concat(str1)));
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str);

        StringBuilder last = builder1.append(str1);

        System.out.println(last);

    }
}
