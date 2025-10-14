#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int a, b, tot = 0;
    int n1, n2, n3;
    cin >> a >> b;
    int n;
    n = a;
    while (n <= b)
    {
        n1 = n / 100;
        n2 = n / 10 % 10;
        n3 = n % 10;
        if (n == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3)
        {
            cout << n << endl;
            tot++;
        }
        n++;
    }
    cout << "Total:" << tot << endl;
}