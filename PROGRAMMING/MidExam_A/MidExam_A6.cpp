#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int a, b, tot = 0;
    cin >> a >> b;
    if (a % 2 == 0)
    {
        a++;
    }
    while (a <= b)
    {
        tot += a;
        a += 2;
    }
    cout << tot << endl;
}