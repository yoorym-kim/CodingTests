import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long count = n * (n - 1) * (n - 2) / 6;

        System.out.println(count);
        System.out.println(3);
    }
}
