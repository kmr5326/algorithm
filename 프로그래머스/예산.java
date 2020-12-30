import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int total=0;
        for(int i=0;i<d.length;i++)
        {
            if(total+d[i]<=budget)
            {
                answer++;
                total+=d[i];
            }
            else break;
        }
        return answer;
    }
}
