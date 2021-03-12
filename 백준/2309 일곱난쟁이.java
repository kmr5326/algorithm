import java.util.*;
import java.io.*;
public class Main {
	
	static int[] heights;
	static List<Integer> result;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		heights=new int[9];
		for(int i=0;i<9;i++)
		{
			heights[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(heights);
		result=new ArrayList<>();
		for(int i=0;i<9;i++)comb(7,i,new ArrayList<Integer>());
		for(int a:result)System.out.println(a);
	}
	
	public static void comb(int r,int idx,List<Integer> list)
	{
		if(r==0)
		{
			int sum=0;
			for(int a:list)sum+=a;
			if(sum==100)
			{
				for(int a:list)result.add(a);
			}
			return;
		}
		for(int i=idx;i<9;i++)
		{
			list.add(heights[idx]);
			comb(r-1,i+1,list);
			if(result.size()==7)return;
			list.remove(list.size()-1);
		}
	}
	
}


