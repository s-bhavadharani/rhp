import java.util.*;

public class Main {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int f=0;
		for(int i=0;i<n;i++){
			char c=s.charAt(i);
			f=f|(1<<(c-'a'));
		}
		if(f==(1<<26)-1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
        
        }

    public static void main(String[] args) {
        solve();
    }
}
