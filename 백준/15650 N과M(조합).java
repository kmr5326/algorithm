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
		nCr(num,N,M,0,arr);
	}
	
	public static void nCr(ArrayList<Integer> num,int N,int r,int index,ArrayList<Integer> arr)
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
		for(int i=index;i<N;i++)
		{
			arr.add(num.get(i));
			nCr(num,N,r-1,i+1,arr);
			arr.remove(arr.size()-1);
		}
	}
	
}


