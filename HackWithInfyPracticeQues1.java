import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		int[] input=new int[n];
		for(int i=0;i<n;i++){
			input[i]=sc.nextInt();
		}
		
		int q=sc.nextInt();
		
		int[][] query=new int[q][4];
		
		for(int i=0;i<q;i++){
			for(int j=0;j<4;j++){
				query[i][j]=sc.nextInt();
			}
		}
		
		int l=n;
		int r=-1;
		
		for(int i=q-1;i>=0;i--){
			int[] x=query[i];
			int X=x[2];
			int Y=x[3];
			
			if(x[0]<l){
				for(int j=x[0];j<=Math.min(l-1,r);j++){
					arr[j]=X+(j-x[0])*Y;
				}
				l=x[0];
			}
			if(x[1]>r){
				for(int j=Math.max(r+1,x[0]);j<=x[1];j++){
					arr[j]=X+(j-x[0])*Y;
				}
				r=x[1];
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		
		if(l>0){
			for(int i=0;i<l;i++){
				arr[i]=input[i];
			}
		}
		if(r<n-1){
			for(int i=r+1;i<n;i++){
				arr[i]=input[i];
			}
		}
		//System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println(sum%(Math.pow(10,9)+7));
	}
}
