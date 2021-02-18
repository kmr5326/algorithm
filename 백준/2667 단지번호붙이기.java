import java.util.*;
import java.io.*;
public class Main {
	
	static int[][] map;
	static boolean[][] visited;
	static int n;
	static int cnt;
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		visited=new boolean[n][n];
		for(int i=0;i<n;i++)Arrays.fill(visited[i], false);
		for(int i=0;i<n;i++)
		{
			String[] s=br.readLine().split("");
			for(int j=0;j<n;j++)map[i][j]=Integer.parseInt(s[j]);
		}
		br.close();
		cnt=0;
		list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(map[i][j]==1&&!visited[i][j])
				{
					cnt++;
					list.add(0);
					func(i,j,cnt-1);
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for(int a:list)System.out.println(a);
	}
	
	public static void func(int r,int c,int cnt)
	{
		visited[r][c]=true;
		list.set(cnt,list.get(cnt)+1);
		if(c+1<n)
		{
			if(map[r][c+1]==1&&!visited[r][c+1])
			{
				func(r,c+1,cnt);
			}
		}
		if(r+1<n)
		{
			if(map[r+1][c]==1&&!visited[r+1][c])
			{
				func(r+1,c,cnt);
			}
		}if(c-1>=0)
		{
			if(map[r][c-1]==1&&!visited[r][c-1])
			{
				func(r,c-1,cnt);
			}
		}
		if(r-1>=0)
		{
			if(map[r-1][c]==1&&!visited[r-1][c])
			{
				func(r-1,c,cnt);
			}
		}
	}
}


