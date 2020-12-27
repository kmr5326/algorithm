
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(long n) {
        String s=Long.toString(n);
        int[] answer = new int[s.length()];
        int idx=0;
        for(int i=s.length()-1;i>-1;i--)answer[idx++]=s.charAt(i)-'0';
        
        return answer;
    }
}
