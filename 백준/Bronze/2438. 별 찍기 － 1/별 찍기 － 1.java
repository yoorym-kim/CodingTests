import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            sb.append("*".repeat(Math.max(0, i)));
            sb.append("\n");
        }
        System.out.println(sb);

        /* StringBuilder로 이중for문
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
         */

        /* 기본코드
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

    }
}
