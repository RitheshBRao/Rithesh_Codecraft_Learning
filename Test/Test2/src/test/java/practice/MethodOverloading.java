package practice;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.some(7, "Jarvis");
    }

    public void some(int i){
        System.out.println(i);
    }

    public void some(int i, int j){
        System.out.println("2nd method");
        System.out.println(j);
    }

    public void some(int i, String j){
        System.out.println("3rd method");
        System.out.println(j);
    }

}
