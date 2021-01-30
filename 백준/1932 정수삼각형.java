import java.util.*;
public class Solution {

	public static int[][] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		dp=new int[n][n+1];
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				dp[i][j]=scan.nextInt();
			}
		}
		scan.close();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				dp[i][j]+=Math.max(dp[i-1][j],dp[i-1][j-1]);
			}
		}
		int max=dp[n-1][1];
        for(int i=2;i<n+1;i++)
        {
        	max=Math.max(dp[n-1][i],max);
        }
        System.out.println(max);
	}
}
