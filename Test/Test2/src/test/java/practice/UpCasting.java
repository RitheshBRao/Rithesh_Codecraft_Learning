package practice;

public class UpCasting {

    static {
        int a = 10;
        System.out.println(a);
    }

    static void abc(){
        System.out.println("abc");
    }


    public static void main(String[] args) {
        System.out.println("hi");
//        Child p = new Child(); // Up-casting
//        System.out.println(p.i);
    }
}

class Parent{
    int i=10;
}

class Child extends Parent{
    int i=20;
}


