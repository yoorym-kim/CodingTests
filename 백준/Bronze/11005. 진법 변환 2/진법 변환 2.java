import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 10진법 수
        int B = Integer.parseInt(st.nextToken()); // 변환할 진법

        Stack<Character> stack = new Stack<>(); // 변환된 숫자를 저장할 스택

        // 10진법 → B진법 변환
        while (N > 0) {
            int remainder = N % B; // 나머지 (B진법에서 해당 자리 숫자)
            if (remainder < 10) {
                stack.push((char) ('0' + remainder)); // 0~9는 그대로 숫자로 저장
            } else {
                stack.push((char) ('A' + (remainder - 10))); // 10 이상은 'A'~'Z'로 변환
            }
            N /= B; // N을 B로 나눠서 몫을 다음 계산에 사용
        }

        // 출력 (스택에 저장된 값들을 차례로 출력)
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}