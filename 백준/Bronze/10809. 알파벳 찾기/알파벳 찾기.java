import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] abc = new int[26];
        for(int i = 0; i < 26; i++) {
            abc[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; //'a'의 아스키값 빼주면 배열인덱스가 됨
            if (abc[index] == -1) {
                abc[index] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(abc[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}