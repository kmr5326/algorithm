import java.util.*;
import java.io.*;
public class Main {
	
	static int[][] net;
	static boolean[] visited;
	static int n;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=scan.nextInt();
		int pair=scan.nextInt();
		cnt=0;
		net=new int[n+1][n+1];
		visited=new boolean[n+1];
		Arrays.fill(visited, false);
		for(int i=0;i<pair;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			net[a][b]=1;
			net[b][a]=1;
		}
		scan.close();
		func(1);
		System.out.println(cnt);
	}
	
	public static void func(int i)
	{
		visited[i]=true;
		for(int j=1;j<n+1;j++)
		{
			if(net[i][j]==1&&!visited[j])
			{
				cnt++;
				func(j);
			}
		}
		
	}
	
}


