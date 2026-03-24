import java.util.*;
class FindTwoElementsThatDoesNotRepeat{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		int flag=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			flag=flag^arr[i];
		}
		
		int og=0,zg=0;
		int sh=0;
		while((flag&(1<<sh))==0) sh++;
		for(int v:arr){
			if((v&(1<<sh))!=0) og^=v;
			else zg^=v;
		}
		
		System.out.println(Math.min(og,zg)+" "+Math.max(og,zg));
		
	}
}
