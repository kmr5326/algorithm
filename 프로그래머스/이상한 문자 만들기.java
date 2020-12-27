
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String s) {
        String answer = "";
        char[] str=s.toCharArray();
        int idx=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==' ')
            {
                idx=0;
            }
            else
            {
                if(idx%2==0)
                {
                    str[i]=Character.toUpperCase(str[i]);
                    idx++;
                }
                else
                {
                    str[i]=Character.toLowerCase(str[i]);
                    idx++;
                }
            }
        }
        answer=String.valueOf(str);
        return answer;
    }
}
