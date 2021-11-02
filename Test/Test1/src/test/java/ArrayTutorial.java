public class ArrayTutorial {
    public static void main(String[] args) {
        System.out.println("Hi this is Rithesh B Rao");

        int i = 10;
        int a[] = new int[3];
        a[0] = 3;
        a[1] = 5;
        a[2] = 19;
        System.out.println(a[1]);
        System.out.println(a.length);

        String s[] = new String[3];
        s[0] = "Hie";
//        s[1] = "Bie";
        s[2] = "Hello";
        System.out.println(s[1]);

        String[] cars = {"BMW", "Honda", "Suzuki"};
        System.out.println(cars[2]);
    }
}
