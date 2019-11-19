import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(curRope(n));
    }
 
    public static int curRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n % 3 == 1) {
            int k = n / 3 - 1;
            return (int)Math.pow(3, k) * 2 * 2;
        }
        if (n % 3 == 2) {
            int k = n / 3;
            return (int)Math.pow(3, k) * 2;
        }
        return (int)Math.pow(3, n / 3);
    }
}