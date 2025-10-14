#include <iostream>
using namespace std;
int main()
{
	string x;
	cin >> x;
	char y = x[2];
	int z = x[1] - '0';
	int d = y;
	if (x[0] == '+')
	{
		d += z;
	}
	else 
	{
		d -= z;
	}
	if (d > 'Z')
	{
		d -= 26;
	}
	if (d < 'A')
	{
		d += 26;
	}
	char out_Text = d;
	cout << out_Text;

	int number = x.size();
	cout << number - 3 << endl;
}

