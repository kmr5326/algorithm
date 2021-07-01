import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int[] T=new int[N+1];
		int[] P=new int[N+1];
		for(int i=1;i<N+1;i++)
		{
			T[i]=scan.nextInt();
			P[i]=scan.nextInt();
		}
		int[] dp=new int[N+2];
		for(int i=N;i>0;i--)
		{
			int day=i+T[i];
			if(day<=N+1)dp[i]=Math.max(dp[i+1],P[i]+dp[day]);
			else dp[i]=dp[i+1];
		}
		System.out.println(dp[1]);
		//https://bcp0109.tistory.com/8
    }
  
  
  	
}
