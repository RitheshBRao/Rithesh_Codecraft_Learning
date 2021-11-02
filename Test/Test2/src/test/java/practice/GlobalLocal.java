package practice;

public class GlobalLocal {

    int i;

//    private double k;

    public void some(){
        System.out.println("The 1st method");
        System.out.println(i);
    }

    public void some1(){
        System.out.println("The 2nd method");
        int k = 15;
//        i = 5;
        System.out.println(i);
    }

    public void main(String[] args) {
        System.out.println("Hi Jarvis");
//        i = 5;
//        System.out.println(i);
        GlobalLocal obj = new GlobalLocal();
        System.out.println(obj.i);
        obj.some1();
        System.out.println(i);
        obj.some();
    }

}
