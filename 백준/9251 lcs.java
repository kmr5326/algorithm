import java.util.*;
public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		scan.close();
		s1='0'+s1;
		s2='0'+s2;
		int[][] dp=new int[s1.length()][s2.length()];
		for(int i=1;i<s1.length();i++)
		{
			for(int j=1;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		System.out.println(dp[s1.length()-1][s2.length()-1]);
	}
	
}
