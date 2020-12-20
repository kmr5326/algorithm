#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

bool solution(string s) {
	bool answer = true;
	if (s.size() == 4 || s.size() == 6)
	{
		for (int i = 0; i < s.size(); i++)
		{
			if (s[i] < 47 || s[i]>58)return false;
		}
	}
	else return false;
	return answer;
}