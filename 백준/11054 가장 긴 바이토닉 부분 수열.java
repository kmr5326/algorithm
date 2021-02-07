import java.util.*;
public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int[] left=new int[n];
		int[] right=new int[n];
		int[] dp=new int[n];
		for(int i=0;i<n;i++)arr[i]=scan.nextInt();
		scan.close();
		left[0]=1;
		int max=0;
		for(int i=1;i<n;i++)
		{
			max=0;
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i]&&left[j]>max)
				{
					max=left[j];
				}
			}
			left[i]=max+1;
		}
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			max=0;
			for(int j=n-1;j>i;j--)
			{
				if(arr[j]<arr[i]&&right[j]>max)
				{
					max=right[j];
				}
			}
			right[i]=max+1;
		}
		for(int i=0;i<n;i++)dp[i]=left[i]+right[i]-1;
		max=0;
		for(int i=0;i<n;i++)max=Math.max(max, dp[i]);
		System.out.println(max);
	}
	
}
