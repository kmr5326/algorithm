
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)answer+=i;
        }
        answer=answer+n;
        return answer;
    }
}
