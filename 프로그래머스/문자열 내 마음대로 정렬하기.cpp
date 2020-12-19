#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

vector<string> solution(vector<string> strings, int n) {
	vector<string> answer;
	string str;
	for (int i = 0; i < strings.size(); i++)
	{
		for (int j = 0; j < strings.size() - 1; j++)
		{
			if (strings[j][n] >= strings[j + 1][n])
			{
				if (strings[j][n] == strings[j + 1][n])
				{
					if (strings[j].compare(strings[j + 1]) > 0)strings[j].swap(strings[j + 1]);
				}
				else
				{
					strings[j].swap(strings[j + 1]);
				}

			}
		}
	}
	for (int i = 0; i < strings.size(); i++)answer.push_back(strings[i]);

	return answer;
}
