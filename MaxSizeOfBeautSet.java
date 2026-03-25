import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> par=new ArrayList<>();
		List<Integer> col=new ArrayList<>();
		for(int i=0;i<n+1;i++)
		{
			par.add(new ArrayList<>());
		}
		for(int i=0;i<n+1;i++)
		{
			col.add(0);
		}
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			par.get(k).add((i+1));
		}
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			col.set((i+1),x);
			
		}
		int q=sc.nextInt();
		int sum=0;
		int mod=1_000_000_007;
		for(int i=0;i<q;i++)
		{
			int x=sc.nextInt();
			int k=1;
			for(int j=0;j<par.get(x).size();j++)
			{
				k=Math.max(k,1+dfs(x,par,col,new HashSet<>()));
			}
			// System.out.println(x+" "+k);
			sum=(sum+k)%mod;
		}
		System.out.println(sum);
	}
	public static int dfs(int p,List<List<Integer>> par,List<Integer> col,HashSet<Integer> st)
	{
		st.add(col.get(p));
		if(par.get(p).size()==0)
		{
			return st.size();
		}
		for(int j=0;j<par.get(p).size();j++)
		{
			return dfs(par.get(p).get(j),par,col,st);
		}
		return -1;
	}
}
