import java.util.*;
public class Solution {

	public static int[][][] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0;
		dp=new int[21][21][21];
		while(true)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a==-1&&b==-1&&c==-1)break;
			System.out.print("w("+a+", "+b+", "+c+") = ");
			System.out.println(w(a,b,c));
		}
	}
	
	public static int w(int a,int b,int c)
	{
		if(check(a,b,c)&&dp[a][b][c]!=0)return dp[a][b][c];
		if(a<=0||b<=0||c<=0)
		{
			return 1;
		}
		else if(a>20||b>20||c>20)
		{
			return dp[20][20][20]=w(20, 20, 20);
		}
		else if(a<b&&b<c)
		{
			return dp[a][b][c]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		else
		{
			return dp[a][b][c]= w(a-1, b, c) + w(a-1, b-1, c)
			+ w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}
	
	public static boolean check(int a,int b,int c)
	{
		if(a>-1&&a<21&&b>-1&&b<21&&c>-1&&c<21)return true;
		else return false;
	}
}


