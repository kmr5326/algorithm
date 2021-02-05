import java.util.*;
public class Solution {
	
	public static int k;
	public static int[] value;
	public static int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		k=scan.nextInt();
		value=new int[n];
		for(int i=0;i<n;i++)value[i]=scan.nextInt();
		scan.close();
		cnt=0;
		func(n-1);
		System.out.println(cnt);
	}
	
	public static void func(int idx)
	{
		if(k==0)
		{
			return;
		}
		int index=0;
		for(int i=idx;i>=0;i--)
		{
			if(value[i]<=k)
			{
				cnt+=k/value[i];
				k%=value[i];
				index=i;
				break;
			}
		}
		func(index-1);
	}
	
}
