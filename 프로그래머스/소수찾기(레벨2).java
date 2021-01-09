import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String numbers) {
        int answer = 0;
        List<Character> arr=new ArrayList<>();
        for(int i=0;i<numbers.length();i++)arr.add(numbers.charAt(i));
        Set<Integer> result=new HashSet<>();
        List<Character> ch=new ArrayList<>();
        for(int i=1;i<=arr.size();i++)pm(arr.size(),i,arr,result,ch);
        for(int a:result)if(isPrime(a))answer++;
        return answer;
    }
    
    public static void pm(int n,int r,List<Character> arr,Set<Integer> result,List<Character> ch)
	{
		
		if(r==0)
		{
			String s="";
			for(char c:ch)s+=Character.toString(c);
			result.add(Integer.parseInt(s));
            return;
		}
		for(int i=0;i<n;i++)
		{
			ch.add(arr.remove(i));
			pm(n-1,r-1,arr,result,ch);
			arr.add(i,ch.remove(ch.size()-1));
		}
	}
    
    public boolean isPrime(int a)
    {
        int tmp=0;
        if(a<2)return false;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)tmp++;
        }
        if(tmp==0)return true;
        return false;
    }
}
