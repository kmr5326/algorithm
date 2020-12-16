
import java.util.*;


public class Solution
{
	public static void main(String args[]) throws Exception
	{
		System.out.println(solution("abcdcba"));
	}
	public static int solution(String s)
    {
        if(s.equals(""))return 0;
        if(s.length()==1)return 1;
        int answer = 1;
        boolean tf=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.length()-i<answer)break;
            for(int j=s.length();j>=i+2;j--)
            {
                if(j-i<answer)break;
                tf=true;
                int idx=j-1;
                for(int k=i;k<(j-i)/2+i;k++)
                {
                    if(s.charAt(k)!=s.charAt(idx--))
                    {
                        tf=false;
                        break;
                    }
                }
                if(tf)answer=j-i;
            }
        }

        return answer;
    }
}