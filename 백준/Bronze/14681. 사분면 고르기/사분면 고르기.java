import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        if (A>0 && B>0){ System.out.println("1"); }
        else if (A<0 && B>0) { System.out.println("2"); }
        else if (A<0 && B<0) { System.out.println("3"); }
        else{System.out.println("4");}
    }
}