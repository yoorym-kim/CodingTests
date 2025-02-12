import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (isGroupWord(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = ' ';

        for (char ch : word.toCharArray()) {
            if (ch != prev) {
                if (seen[ch - 'a']) {
                    return false;
                }
                seen[ch - 'a'] = true;
            }
            prev = ch;
        }
        return true;
    }
}
