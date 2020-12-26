
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String s, int n) {
        String answer = "";
        char[] str=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(str[i]))
            {
                if(str[i]+n<'z'+1)str[i]+=n;
                else str[i]=(char)(str[i]+n-26);
            }
            else if(str[i]==' ');
            else
            {
                if(str[i]+n<'Z'+1)str[i]+=n;
                else str[i]=(char)(str[i]+n-26);
            }
        }
        answer=String.valueOf(str);
        return answer;
    }
}
