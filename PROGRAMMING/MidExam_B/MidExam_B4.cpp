#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n;
    cin >> n;
    if (n < 0)
    {
        cout << "error" << endl;
        return 0;
    }
    cout << "2000: " << n / 2000 << endl;
    n = n % 2000;
    cout << "1000: " << n / 1000 << endl;
    n = n % 1000;
    cout << "500: " << n / 500 << endl;
    n = n % 500;
    cout << "200: " << n / 200 << endl;
    n = n % 200;
    cout << "100: " << n / 100 << endl;
    n = n % 100;
    cout << "50: " << n / 50 << endl;
    n = n % 50;
    cout << "10: " << n / 10 << endl;
    n = n % 10;
    cout << "5: " << n / 5 << endl;
    n = n % 5;
    cout << "1: " << n / 1 << endl;
    n = n % 1;
}