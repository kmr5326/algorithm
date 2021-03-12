import java.util.*;
import java.io.*;
public class Main {
	
	static int n,m;
	static int[][] A,B;
	static int result;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		n=Integer.parseInt(s[0]);
		m=Integer.parseInt(s[1]);
		A=new int[n][m];
		B=new int[n][m];
		for(int i=0;i<n;i++)
		{
			s=br.readLine().split("");
			for(int j=0;j<m;j++)
			{
				A[i][j]=Integer.parseInt(s[j]);
			}
		}
		for(int i=0;i<n;i++)
		{
			s=br.readLine().split("");
			for(int j=0;j<m;j++)
			{
				B[i][j]=Integer.parseInt(s[j]);
			}
		}
		br.close();
		if(n<3||m<3)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(A[i][j]!=B[i][j])
					{
						System.out.println(-1);
						return;
					}
				}
			}
			System.out.println(0);
			return;
		}
		result=0;
		for(int i=1;i<n-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{
				if(A[i-1][j-1]!=B[i-1][j-1])
				{
					for(int a=i-1;a<=i+1;a++)
					{
						for(int b=j-1;b<=j+1;b++)
						{
							if(A[a][b]==1)A[a][b]=0;
							else A[a][b]=1;
						}
					}
					result++;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(A[i][j]!=B[i][j])
				{
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(result);
	}
	
	
	
}


