import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int x = 0; x < m; x++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            for (int y = i-1; y < j; y++) {
                arr[y] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.append(arr[n-1]));
    }
}