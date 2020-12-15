#include <string>
#include <vector>

using namespace std;

void main() {
	
}

vector<int> solution(vector<int> numbers) {
	vector<int> answer;
	int tf;
	int n;
	for (int i = 0; i < numbers.size() - 1; i++) {
		for (int j = i + 1; j < numbers.size(); j++) {
			n = numbers[i] + numbers[j];

			tf = 0;
			for (int k = 0; k < answer.size(); k++) {
				if (n == answer[k])tf = 1;
			}
			if (tf == 0)answer.push_back(n);
		}
	}
	int min;
	int tmp;
	int idx = 0;
	for (int i = 0; i < answer.size() - 1; i++) {
		for (int j = 0; j < answer.size() - 1; j++) {
			if (answer[j] > answer[j + 1]) {
				tmp = answer[j];
				answer[j] = answer[j + 1];
				answer[j + 1] = tmp;
			}
		}
	}



	return answer;
}


