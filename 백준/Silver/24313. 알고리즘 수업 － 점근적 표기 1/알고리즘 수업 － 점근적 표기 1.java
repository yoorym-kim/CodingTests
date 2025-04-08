import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean yes = true;
        for (int n = n0; n <= 100; n++) {
            long fn = (long)a1 * n + a0;
            long cn = (long)c * n;

            if (fn > cn) {
                yes = false;
                break;
            }
        }

        System.out.println(yes ? 1 : 0);
    }
}
