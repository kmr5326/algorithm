#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

vector<int> solution(vector<int> answers) {
	vector<int> answer;
	int arr1[5] = { 1,2,3,4,5 };
	int arr2[8] = { 2,1,2,3,2,4,2,5 };
	int arr3[10] = { 3,3,1,1,2,2,4,4,5,5 };
	int idx = 0;
	int cnt1 = 0;
	int cnt2 = 0;
	int cnt3 = 0;
	int Max;
	int n = answers.size();
	vector<int> one;
	for (int i = 0; i < n; i++)
	{
		if (idx == 5)idx = 0;
		one.push_back(arr1[idx++]);
	}
	idx = 0;
	vector<int> two;
	for (int i = 0; i < n; i++)
	{
		if (idx == 8)idx = 0;
		two.push_back(arr2[idx++]);
	}
	idx = 0;
	vector<int> three;
	for (int i = 0; i < n; i++)
	{
		if (idx == 10)idx = 0;
		three.push_back(arr3[idx++]);
	}
	for (int i = 0; i < n; i++)
	{
		if (answers[i] == one[i])cnt1++;
		if (answers[i] == two[i])cnt2++;
		if (answers[i] == three[i])cnt3++;
	}
	Max = max(max(cnt1, cnt2), cnt3);
	if (Max == cnt1)answer.push_back(1);
	if (Max == cnt2)answer.push_back(2);
	if (Max == cnt3)answer.push_back(3);
	return answer;
}
