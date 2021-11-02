package practice;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListVsHashTable {
    public static void main(String[] args) {
//        System.out.println("Hi");

//        To create ArrayList
        System.out.println("rithesh");
        ArrayList<Integer> a = new ArrayList<Integer>();
//        a.add(Integer.valueOf("Hie"));
        a.add(4);
        a.add(78);

        System.out.println(a.get(0));

        Hashtable h = new Hashtable();
        h.put(2,3);
        h.put("put", "set");

        System.out.print(h.get("put"));
    }
}
