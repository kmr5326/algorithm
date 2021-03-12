import java.util.*;
import java.io.*;
public class Main {
	
	static int n;
	static int[][] cost;
	static boolean[] visited;
	static int min;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		cost=new int[n][n];
		visited=new boolean[n];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++)
		{
			String[] s=br.readLine().split(" ");
			for(int j=0;j<n;j++)
			{
				cost[i][j]=Integer.parseInt(s[j]);
			}
		}
		br.close();
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)func(i,i,0,1);
		System.out.println(min);
	}
	
	public static void func(int start,int now,int sum,int cnt)
	{
		if(cnt==n)
		{
			if(cost[now][start]==0)return;
			sum+=cost[now][start];
			min=Math.min(min, sum);
			return;
			
		}
		visited[now]=true;
		for(int i=0;i<n;i++)
		{
			if(cost[now][i]!=0&&!visited[i])
			{
				
				func(start,i,sum+cost[now][i],cnt+1);
				visited[i]=false;
			}
		}
	}
}


