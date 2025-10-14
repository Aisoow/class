#include <string>
#include <iostream>
#include <sstream>
using namespace std;

int main()
{

	stringstream ss;
	ss << 3.14159;
	string s = ss.str();
	cout << s << endl;
	return 0;
}