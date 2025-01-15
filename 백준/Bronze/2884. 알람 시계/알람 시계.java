import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        b -= 45;
        if (b < 0) {
            b += 60;
            a -= 1;
        }
        if (a < 0) {
            a = 23;
        }

        System.out.println(a + " " + b);
    }
}