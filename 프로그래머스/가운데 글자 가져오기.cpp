#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

string solution(string s) {
	string answer = "";
	if (s.length() % 2 == 0)
	{
		answer = s.substr(s.length() / 2 - 1, 2);
	}
	else
	{
		answer = s.substr(s.length() / 2, 1);
	}
	return answer;
}
