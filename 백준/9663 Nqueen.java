import java.util.*;
public class Solution {

	public static int[] Cols;
	public static int N;
	public static int result=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		scan.close();
		Cols=new int[N];
		Nqueen(0);
		System.out.println(result);
	}
	
	public static void Nqueen(int row)
	{
		if(row==N)
		{
			result++;
			return;
		}
		for(int i=0;i<N;i++)
		{
			if(check(row+1,i))
			{
				Cols[i]=row+1;
				Nqueen(row+1);
				Cols[i]=0;
			}
		}
	}
	public static boolean check(int row,int col)
	{
		if(Cols[col]!=0)return false;
		for(int i=0;i<N;i++)
		{
			if(Cols[i]!=0&&Math.abs(Cols[i]-row)==Math.abs(col-i))return false;
		}
		return true;
	}
}


