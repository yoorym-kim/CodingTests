import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken(); // B진법 수
        int B = Integer.parseInt(st.nextToken()); // B진법 기준

        int decimalValue = Integer.parseInt(N, B); // B진법 → 10진법 변환
        System.out.println(decimalValue);
    }
}