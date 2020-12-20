#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

string solution(string s) {
	string answer = "";
	char tmp;
	for (int i = 0; i < s.length(); i++)
	{
		if (islower(s[i]))answer += s[i];
	}
	if (answer.length() > 1)
	{
		for (int i = 0; i < answer.length(); i++)
		{
			for (int j = 0; j < answer.length() - 1; j++)
			{
				if (answer[j] < answer[j + 1])
				{
					tmp = answer[j];
					answer[j] = answer[j + 1];
					answer[j + 1] = tmp;
				}
			}
		}
	}
	int idx = answer.length();
	for (int i = 0; i < s.length(); i++)
	{
		if (isupper(s[i]))answer += (s[i]);
	}
	for (int i = idx; i < answer.length(); i++)
	{
		for (int j = idx; j < answer.length() - 1; j++)
		{
			if (answer[j] < answer[j + 1])
			{
				tmp = answer[j];
				answer[j] = answer[j + 1];
				answer[j + 1] = tmp;
			}
		}
	}
	return answer;
}