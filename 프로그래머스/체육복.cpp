#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

int solution(int n, vector<int> lost, vector<int> reserve) {
	int answer = 0;
	answer = n - lost.size();
	for (int i = 0; i < lost.size(); i++)
	{
		for (int j = 0; j < reserve.size(); j++)
		{
			if (lost[i] == reserve[j])
			{
				reserve.erase(reserve.begin() + j);
				lost.erase(lost.begin() + i);
				i--;
				answer += 1;
				break;
			}
		}
	}

	for (int i = 0; i < lost.size(); i++)
	{
		for (int j = 0; j < reserve.size(); j++)
		{
			if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1)
			{
				answer += 1;
				reserve.erase(reserve.begin() + j);
				break;
			}
		}
	}
	return answer;
}
