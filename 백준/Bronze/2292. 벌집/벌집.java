import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int layer = 1;
        int maxInLayer = 1;
        
        while (maxInLayer < N) {
            maxInLayer += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
