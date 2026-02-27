import java.util.*;

public class Main {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int f=0;
        for(int i=0;i<n;i++){
        	char c=s.charAt(i);
        	f=f^(1<<(c-'a'));
        }
        if(f==0||(f&(f-1))==0){
        	System.out.println("YES");
        }
        else{
        	System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
