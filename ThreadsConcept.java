import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        for(int i=1;i<=k;i++){
        	Worker w=new Worker(i,n);
        	w.start();
        }

    }
}

class Worker extends Thread{
	int id;
	int n;
	public Worker(int id,int n){
		this.id=id;
		this.n=n;
	}
	public void run(){
	for(int i=1;i<=n;i++){
		System.out.println("Worker : "+id+" task : "+i);
	}
	}
}
