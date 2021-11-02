public class Test123 {
    public static void main(String[] args) {
        try{
            String obj = "null";
            String copyObj = new String(obj);
            if (obj.contains("null"))
                System.out.println(2);
            else
                System.out.println(3);
        } finally {
            System.out.println(3);
        }
    }
}
