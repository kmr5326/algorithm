import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(int n) {
        String answer = "";
        int a;
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            a=n%3;
            if(a==0)
            {
                a=4;
                n=n/3-1;
            }
            else n/=3;
            sb.insert(0,Integer.toString(a));
        }
        answer=sb.toString();
        return answer;
    }
}
