import java.util.*;
import java.io.*;
public class Main {
	
	static int n;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Solution s=new Solution();
		System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm"));

	}
	
	
	
}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id=new_id.toLowerCase();
        new_id=new_id.replaceAll("[^\\w|\\-|_|.]","");
         while(new_id.contains(".."))new_id=new_id.replace("..",".");
        if(new_id.charAt(0)=='.')
        {
            if(new_id.length()>1)new_id=new_id.substring(1,new_id.length());
            else new_id="";
        }
        if(!new_id.equals(""))
        {
            if(new_id.charAt(new_id.length()-1)=='.')
            {
                if(new_id.length()>1)new_id=new_id.substring(0,new_id.length()-1);
                else new_id="";
            }
        }
        if(new_id.equals(""))new_id="a";
        if(new_id.length()>=16)
        {
            new_id=new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1)=='.')new_id=new_id.substring(0,new_id.length()-1);
        }
        if(new_id.length()<=2)while(new_id.length()<3)new_id=new_id.concat(String.valueOf(new_id.charAt(new_id.length()-1)));
        answer=new_id;
        return answer;
    }
}