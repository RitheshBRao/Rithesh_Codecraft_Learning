public class Test2 {
    public static void main(String[] args) {

        String a = "apple";
        String b = "orange";




        a = a.concat(b);
        b = a;
        b = b.substring(0,a.indexOf('o'));

        a = a.substring(a.indexOf('o'),a.length());

        System.out.println(a);
        System.out.println(b);






    }
}
