import java.util.*;

public class Main {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = s.length();

        for (int ctr = 1; ctr < (1 << N); ctr++) {

            for (int sh = 0; sh < N; sh++) {
                if ((ctr & (1 << sh)) != 0) {
                    System.out.print(s.charAt(sh));
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
