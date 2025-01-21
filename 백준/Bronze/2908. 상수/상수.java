import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder newA = new StringBuilder();
        StringBuilder newB = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            newA.append(a.charAt(i));
        }
        for (int i = 2; i >= 0; i--) {
            newB.append(b.charAt(i));
        }
        if (Integer.parseInt(newA.toString()) > Integer.parseInt(newB.toString())) {
            System.out.println(newA);
        } else {
            System.out.println(newB);
        }
    }
}