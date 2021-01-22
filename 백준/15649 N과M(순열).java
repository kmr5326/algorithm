import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		ArrayList<Integer> num=new ArrayList<>();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			num.add(i+1);
		}
		nPr(num,N,M,arr);
	}
	
	public static void nPr(ArrayList<Integer> num,int N,int r,ArrayList<Integer> arr)
	{
		if(r==0)
		{
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			//arr.clear();
		}
		for(int i=0;i<N;i++)
		{
			arr.add(num.remove(i));
			nPr(num,N-1,r-1,arr);
			num.add(i,arr.remove(arr.size()-1));
		}
	}
	
}


