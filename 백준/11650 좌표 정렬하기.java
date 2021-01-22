import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		String[] s=new String[N];
		for(int i=0;i<N;i++)s[i]=scan.next();
		Arrays.sort(s,new Comparator<String> () {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if (s1.length() == s2.length())
					return s1.compareTo(s2);
				else 
					return Integer.compare(s1.length(),s2.length());
			}
			
		});
		List<String> list=new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			if(!list.contains(s[i]))list.add(s[i]);
		}
		for(String str:list)System.out.println(str);
	}
}
