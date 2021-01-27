import java.util.*;
public class Solution {

	public static int N;
	public static int[] num;
	public static List<Integer> list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		num=new int[N];
		for(int i=0;i<N;i++)
		{
			num[i]=scan.nextInt();
		}
		int addcnt=scan.nextInt();
		int subcnt=scan.nextInt();
		int mulcnt=scan.nextInt();
		int devcnt=scan.nextInt();
		scan.close();
		list=new ArrayList<>();
		recursion(addcnt,subcnt,mulcnt,devcnt,1,num[0]);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
	}
	
	public static void recursion(int addcnt,int subcnt,int mulcnt,int devcnt,int idx,int result)
	{
		if(idx==N)
		{
			list.add(result);
			return ;
		}
		if(addcnt>0)
		{
			recursion(addcnt-1,subcnt,mulcnt,devcnt,idx+1,add(result,num[idx]));
		}
		if(subcnt>0)
		{
			recursion(addcnt,subcnt-1,mulcnt,devcnt,idx+1,sub(result,num[idx]));
		}
		if(mulcnt>0)
		{
			recursion(addcnt,subcnt,mulcnt-1,devcnt,idx+1,mul(result,num[idx]));
		}
		if(devcnt>0)
		{
			recursion(addcnt,subcnt,mulcnt,devcnt-1,idx+1,dev(result,num[idx]));
		}
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return a-b;
	}

	public static int mul(int a,int b)
	{
		return a*b;
	}
	
	public static int dev(int a,int b)
	{
		return a/b;
	}
}


