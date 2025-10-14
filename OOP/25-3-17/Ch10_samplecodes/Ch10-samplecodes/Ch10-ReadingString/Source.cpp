#include <string>
#include <iostream>

using namespace std;

int main()
{
	//string city;
	//cout << "Enter a city name: ";
	//cin >> city;
	//cout << "The city name you entered is: " << city << endl;
	//return 0;

	string city;;
	cout << "Enter a city name: ";
	//getline(cin, city);
	//getline(cin, city, '/n');
	getline(cin, city, ' ');
	cout << "The city name you entered is: " << city << endl;
	return 0;

}