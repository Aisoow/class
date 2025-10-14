#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int a, b, c, d, n;
    cin >> n;
    a = ((n / 1000) + 4) % 10;
    b = ((n / 100 % 10) + 4) % 10;
    c = ((n / 10 % 10) + 4) % 10;
    d = ((n % 10) + 4) % 10;
    cout << c << d << a << b << endl;
}