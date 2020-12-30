import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=Math.max(n,m);
        int min=Math.min(n,m);
        int a=max*min;
        while(min!=0)
        {
            int num=max%min;
            max=min;
            min=num;
        }
        answer[0]=max;
        answer[1]=a/answer[0];
        return answer;
    }
}
