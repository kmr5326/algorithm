import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String s) {
	    int answer = 0;
	    String tmp = "";
		String result = "";
		int count = 1;
		answer = s.length();	       	       
		for(int i = 1; i <= s.length()/2; i++)
		{
		   for(int j = 1; j <= s.length()/i; j++)
		   {
		       if(tmp.equals(s.substring((j-1)*i, j*i)))
		       {
		    	   count++;
		       }
		       else
		       {
		    	   if(count != 1)
		    	   {
		    		   result += Integer.toString(count);
		    		   count = 1;
		    	   }
		    	   result += s.substring((j-1)*i, j*i);
		       }
		       tmp = s.substring((j-1)*i, j*i);
	           }
		   if(count != 1)
		   {
	               result += Integer.toString(count);
		       count = 1;
		   }
		   if(s.length() %i != 0)
		   {
		       result += s.substring(s.length() - s.length() % i, s.length());
		   }
		   if(result.length() < answer)
		   {
		       answer = result.length();
		   }
	           result = "";
	    } 
	    return answer;
	    }
}
