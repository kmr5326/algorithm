#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

void main() {
	
}

int solution(int n) {
	int answer = 0;
	bool prime[n + 1];
	for (int i = 2; i <= n; i++)
	{
		prime[i] = true;
	}
	for (int i = 2; i <= sqrt(n); i++)
	{
		if (prime[i] == true)
		{
			for (int j = i + i; j <= n; j += i)prime[j] = false;
		}
	}
	for (int i = 2; i <= n; i++)
	{
		if (prime[i] == true)answer++;
	}
	return answer;
}