import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> xCount = new HashMap<>();
        HashMap<Integer, Integer> yCount = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xCount.put(x, xCount.getOrDefault(x, 0) + 1);
            yCount.put(y, yCount.getOrDefault(y, 0) + 1);
        }

        int fourthX = 0, fourthY = 0;

        for (int key : xCount.keySet()) {
            if (xCount.get(key) == 1) {
                fourthX = key;
                break;
            }
        }

        for (int key : yCount.keySet()) {
            if (yCount.get(key) == 1) {
                fourthY = key;
                break;
            }
        }

        System.out.println(fourthX + " " + fourthY);
    }
}
