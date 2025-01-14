import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        System.out.println(Integer.parseInt(a)*Character.getNumericValue(b.charAt(2)));
        System.out.println(Integer.parseInt(a)*Character.getNumericValue(b.charAt(1)));
        System.out.println(Integer.parseInt(a)*Character.getNumericValue(b.charAt(0)));
        System.out.println(Integer.parseInt(a)*Integer.parseInt(b));
    }
}