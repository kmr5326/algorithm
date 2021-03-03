import java.util.*;
import java.io.*;
public class Main {
	
	
	static int n;
	static int[][] arr;
	static int[] cnt;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		cnt=new int[3];
		for(int i=0;i<n;i++)
		{
			String[] s=br.readLine().split(" ");
			for(int j=0;j<n;j++)arr[i][j]=Integer.parseInt(s[j]);
		}
		br.close();
		func(0,0,n);
		System.out.println(cnt[0]);
		System.out.println(cnt[1]);
		System.out.println(cnt[2]);
	}
	
	public static void func(int x,int y,int size)
	{
		
		if(check(x,y,size))
		{
			if(arr[x][y]==-1)cnt[0]++;
			else if(arr[x][y]==0)cnt[1]++;
			else if(arr[x][y]==1)cnt[2]++;
		}
		else
		{
			func(x,y,size/3);
			func(x,y+size/3,size/3);
			func(x,y+size/3*2,size/3);
			func(x+size/3,y,size/3);
			func(x+size/3*2,y,size/3);
			func(x+size/3,y+size/3,size/3);
			func(x+size/3*2,y+size/3,size/3);
			func(x+size/3,y+size/3*2,size/3);
			func(x+size/3*2,y+size/3*2,size/3);
		}
		
	}
	
	public static boolean check(int x,int y,int size)
	{
		int a=arr[x][y];
		for(int i=x;i<x+size;i++)
		{
			for(int j=y;j<y+size;j++)
			{
				if(arr[i][j]!=a)return false;
			}
		}
		return true;
	}
}


