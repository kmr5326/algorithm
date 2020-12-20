#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

bool solution(string s)
{
	bool answer = true;
	int p = 0;
	int y = 0;
	for (int i = 0; i < s.size(); i++)
	{
		if (s[i] == 'p' || s[i] == 'P')p += 1;
		if (s[i] == 'y' || s[i] == 'Y')y += 1;
	}
	if (p == y)answer = true;
	else answer = false;
	

	return answer;
}