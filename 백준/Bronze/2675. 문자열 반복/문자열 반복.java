import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++){
                for (int k = 0; k < r; k++) {
                    sb.append(s.charAt(j));
                }
                //java11부터 가능한 코드
                // sb.append(String.valueOf(s.charAt(j)).repeat(Math.max(0, r)));
            }
            System.out.println(sb);
        }
    }
}