package practice;

public class TestClass extends ChildClass{

    public static void main(String[] args) {
        something();
        ChildClass obj = new ChildClass();
        obj.something();
    }

}

class ChildClass{
    int a = 10; //Instance or Non-static variable
    static int b = 20; //Class Static Variable

    // Static Method
    static void something(){
        System.out.println("Something");
    }

    // Non-static method
    void special(){
        System.out.println("Special");
    }
}