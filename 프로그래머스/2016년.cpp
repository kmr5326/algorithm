#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void main() {
	
}

string solution(int a, int b) {
	string answer = "";
	string str[7] = { "THU","FRI","SAT","SUN","MON","TUE","WED" };
	int n;
	switch (a) {
	case 1:
		n = b % 7;
		answer = str[n];
		break;
	case 2:
		n = (b + 31) % 7;
		answer = str[n];
		break;
	case 3:
		n = (b + 60) % 7;
		answer = str[n];
		break;
	case 4:
		n = (b + 91) % 7;
		answer = str[n];
		break;
	case 5:
		n = (b + 121) % 7;
		answer = str[n];
		break;
	case 6:
		n = (b + 152) % 7;
		answer = str[n];
		break;
	case 7:
		n = (b + 182) % 7;
		answer = str[n];
		break;
	case 8:
		n = (b + 213) % 7;
		answer = str[n];
		break;
	case 9:
		n = (b + 244) % 7;
		answer = str[n];
		break;
	case 10:
		n = (b + 274) % 7;
		answer = str[n];
		break;
	case 11:
		n = (b + 305) % 7;
		answer = str[n];
		break;
	case 12:
		n = (b + 335) % 7;
		answer = str[n];
		break;
	}
	return answer;
}
