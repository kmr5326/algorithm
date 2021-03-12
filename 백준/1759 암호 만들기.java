import java.util.*;
import java.io.*;
public class Main {
	
	static int l,c;
	static List<String> chars;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		l=Integer.parseInt(s[0]);
		c=Integer.parseInt(s[1]);
		s=br.readLine().split(" ");
		chars=new ArrayList<>();
		for(String a:s)chars.add(a);
		Collections.sort(chars);
		comb(l,0,new ArrayList<String>());
	}
	
	public static void comb(int r,int idx,List<String> list)
	{
		if(r==0)
		{
			int cnt1=0,cnt2=0;
			StringBuilder sb=new StringBuilder();
			for(String s:list)
			{
				if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u"))cnt1++;
				else cnt2++;
				sb.append(s);
			}
			if(cnt1<1||cnt2<2)return;
			System.out.println(sb.toString());
		}
		for(int i=idx;i<c;i++)
		{
			
			list.add(chars.get(i));
			comb(r-1,i+1,list);
			list.remove(list.size()-1);
		}
	}
	
}


