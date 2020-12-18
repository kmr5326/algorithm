
import java.util.*;


public class Solution
{
	
	public static void main(String args[])
	{
		
	}
	
    public int solution(int n) {
        int answer = 0;
        String s="";
        int exp=0;
        while(n>0)
        {
            s+=Integer.toString(n%3);
            n=n/3;
        }
        for(int i=s.length()-1;i>-1;i--)
        {
            answer+=Math.pow(3,exp++)*(s.charAt(i)-'0');
        }
        return answer;
    }
	
	
}