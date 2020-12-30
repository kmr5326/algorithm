import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int num) {
        int answer = 0;
        int cnt=0;
        long n=(long)num;
        while(n!=1)
        {
            if(cnt==501)return -1;
            cnt++;
            if(n%2==0)
            {
                n/=2;
            }
            else
            {
                n=n*3+1;
            }
        }
        return answer=cnt;
    }
}
