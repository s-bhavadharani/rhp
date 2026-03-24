import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int[] need=new int[n];
		int[] dig=new int[n];
		
		need[0]=arr[0];
		for(int i=1;i<n;i++){
			need[i]=need[i-1]-1;
		}
		
		for(int i=0;i<n;i++){
			dig[i]=arr[i]-need[i];
			if(dig[i]!=0){
				pq.add(dig[i]);
			}
		}
		
		int alreadyDug=0;
		int days=0;
		while(!pq.isEmpty()){
			int x=pq.poll();
			if(alreadyDug<x){
				days++;
				alreadyDug=(2*days)-1;
			}
			
		}
		
		System.out.println(days);
		
	}
}
