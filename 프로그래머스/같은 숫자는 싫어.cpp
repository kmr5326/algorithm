#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

vector<int> solution(vector<int> arr)
{
	vector<int> answer;
	answer.push_back(arr[0]);
	for (int i = 0; i < arr.size(); i++)
	{
		if (arr[i] != answer.back())
		{
			answer.push_back(arr[i]);
		}
	}
	

	return answer;
}
