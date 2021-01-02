import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int idx;
        String str;
        for(int i=0;i<skill_trees.length;i++)
        {
            answer++;
            idx=skill.length();
            for(int j=skill.length();j>0;j--)
            {
                str=skill.substring(j-1,j);
                if(skill_trees[i].contains(str))
                {
                    if(j!=1)
                    {
                        if(skill_trees[i].contains(skill.substring(j-2,j-1)))
                        {
                            if(skill_trees[i].indexOf(str)<skill_trees[i].indexOf(skill.substring(j-2,j-1)))
                            {
                                answer--;
                                break;
                            }
                        }
                        else
                        {
                            answer--;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
