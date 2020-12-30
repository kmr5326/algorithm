import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean solution(int x) {
        boolean answer = true;
        int sum=0,n=x;
        while(n>0)
        {
            sum=sum+n%10;
            n/=10;
        }
        if(x%sum!=0)return false;
        return answer;
    }
}
