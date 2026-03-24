import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		PriorityQueue<Integer> one=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> zero=new PriorityQueue<>();
		
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			one.add(x);
		}
		long ans=0L;
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			zero.add(x);
		}
		int MOD=1_000_000_007;
		for(int i=0;i<n;i++){
			int o=one.poll();
			while(o-->0){
				ans=((ans*2)+1)%MOD;
			}
			int z=zero.poll();
			while(z-->0){
				ans=((ans*2)+0)%MOD;
			}
		}
		System.out.println(ans);
	}
}
