import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public long solution(long n) {
        long answer = 0;
        if((long)Math.sqrt(n)*(long)Math.sqrt(n)==n)answer=(long)((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        else answer=-1;
        return answer;
    }
}
