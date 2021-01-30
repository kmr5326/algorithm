import java.util.*;
public class Solution {

	public static long[] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		dp=new long[101];
		dp[1]=dp[2]=dp[3]=1;
        dp[4]=dp[5]=2;
		for(int i=6;i<101;i++)
		{
			dp[i]=dp[i-1]+dp[i-5];
		}
		while(T>0)
		{
			int n=scan.nextInt();
			System.out.println(dp[n]);
            T--;
		}
        scan.close();
	}
}
