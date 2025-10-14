#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, a, b, c;
    int a1, b1, c1;
    int a2, b2, c2;
    int a3, b3, c3;
    cin >> n;
    a = n / 100;
    b = n / 10 % 10;
    c = n % 10;
    a1 = a / 4 % 2;
    a2 = a / 2 % 2;
    a3 = a % 2;
    b1 = b / 4 % 2;
    b2 = b / 2 % 2;
    b3 = b % 2;
    c1 = c / 4 % 2;
    c2 = c / 2 % 2;
    c3 = c % 2;
    cout << a1 << a2 << a3 << b1 << b2 << b3 << c1 << c2 << c3 << endl;
}