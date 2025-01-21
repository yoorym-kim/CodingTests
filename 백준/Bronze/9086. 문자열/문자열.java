import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0)).append(s.charAt(s.length()-1));
            System.out.println(sb);
        }
    }
}