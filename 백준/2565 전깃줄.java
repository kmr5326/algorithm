import java.util.*;
public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[501];
		int idx;
		int[] dp=new int[501];
		for(int i=0;i<n;i++)
		{
			idx=scan.nextInt();
			arr[idx]=scan.nextInt();
		}
		scan.close();
		dp[0]=1;
		int max=0;
		int result=0;
		for(int i=1;i<501;i++)
		{
			max=0;
			for(int j=0;j<i;j++)
			{
				if(arr[j]!=0&&arr[j]<arr[i]&&dp[j]>max)
				{
					max=dp[j];
				}
			}
			dp[i]=max+1;
			if(result<dp[i])result=dp[i];
		}
		System.out.println(n-result);
	}
	
}
