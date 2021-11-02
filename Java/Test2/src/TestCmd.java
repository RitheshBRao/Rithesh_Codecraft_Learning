import java.io.*;

public class TestCmd {
    public static void main(String[] args) throws Exception {
//        System.out.println("111");
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/C", "adb devices");

//        ProcessBuilder builder = new ProcessBuilder(
//                "cmd.exe", "/c", "cd \"C:\\Users\\RitheshB\\Downloads\\platform-tools\", && dir");

        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
//            System.out.println("222");
        }
    }
}


//getruntime.windows for widnows