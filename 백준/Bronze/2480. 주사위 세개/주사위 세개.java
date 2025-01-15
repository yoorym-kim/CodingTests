import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && a ==c){
            System.out.println(10000+a*1000);
        } else if (a != b && a != c && b != c) {
            System.out.println(Math.max(a, Math.max(b, c))*100);
        } else {
            if (a == b){
                System.out.println(1000+a*100);
            } else if (a == c) {
                System.out.println(1000+a*100);
            } else {
                System.out.println(1000+b*100);
            }
        }
    }
}