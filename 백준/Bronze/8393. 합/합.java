import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		System.out.println(n * (n + 1) / 2);
	}
}