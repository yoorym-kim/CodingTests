import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        StringTokenizer st = new StringTokenizer(input1);
        int c = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 1000/60 == 16
        a += c/60;
        b += c%60;

        if(b/60 ==1){
            a +=1;
        }
        System.out.println(a%24+" "+b%60);
    }
}