import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken())-1; //3 -> 2
            int b = Integer.parseInt(st1.nextToken())-1; //4 -> 3
            int len = b-a+1;

            if(len != 1) {
                int[] arr1 = new int[len]; //3-2+1 = 2

                System.arraycopy(arr, a, arr1, 0, len);
                for(int j = 0; j < len; j++) {
                    arr[a+j]=arr1[len-1-j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}