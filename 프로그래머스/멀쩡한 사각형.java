
import java.util.*;


public class Solution
{
	public static void main(String args[]) throws Exception
	{
		
	}
	public long solution(int w, int h) {
        long answer = 1;
        long n,w1=w,h1=h;
        if(w1>h1)
        {
            n=gcd(w,h);
            answer=w1*h1-(w1+h1-n);
        }
        else if(w1<h1)
        {
            n=gcd(h1,w1);
            answer=w1*h1-(w1+h1-n);
        }
        else answer=w1*h1-w1;
        return answer;
    }
    
    public long gcd(long a,long b)
    {
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
}