import java.util.*;
public class Solution {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int[] dp=new int[n];
		for(int i=0;i<n;i++)arr[i]=scan.nextInt();
		scan.close();
		dp[0]=1;
		int max=0;
		for(int i=1;i<n;i++)
		{
			max=0;
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i]&&dp[j]>max)
				{
					max=dp[j];
				}
			}
			dp[i]=max+1;
		}
		max=dp[0];
		for(int i=1;i<n;i++)max=Math.max(max,dp[i]);
		System.out.println(max);
	}
	
}
