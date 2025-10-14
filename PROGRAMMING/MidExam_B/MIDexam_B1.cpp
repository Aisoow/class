#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, a, b, c, d;
    cin >> n;
    a = n % 2;
    b = n / 2 % 2;
    c = n / 4 % 2;
    d = n / 8 % 2;
    cout << d << c << b << a << endl;
}