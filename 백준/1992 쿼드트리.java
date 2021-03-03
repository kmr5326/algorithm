import java.util.*;
import java.io.*;
public class Main {
	
	
	static int n;
	static int[][] arr;
	static int one;
	static int zero;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			String[] s=br.readLine().split("");
			for(int j=0;j<n;j++)arr[i][j]=Integer.parseInt(s[j]);
		}
		br.close();
		func(0,0,n);
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)System.out.print(arr[i][j]);
			System.out.println();
		}*/
	}
	
	public static void func(int x,int y,int size)
	{
		
		if(check(x,y,size))
		{
			if(arr[x][y]==1)System.out.print(1);
			else System.out.print(0);
		}
		else
		{
			System.out.print("(");
			func(x,y,size/2);
			func(x,y+size/2,size/2);
			func(x+size/2,y,size/2);
			func(x+size/2,y+size/2,size/2);
			System.out.print(")");
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


