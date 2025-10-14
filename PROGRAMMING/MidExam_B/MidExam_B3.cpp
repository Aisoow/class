#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, t = 100;
    int num;
    int a, b, c;
    cin >> num;
    while (num != 0)
    {
        n = num / t % 10;
        a = n / 4 % 2;
        b = n / 2 % 2;
        c = n / 2;
        cout << a << b << c;
        t /= 10;
    }
    cout << endl;
}