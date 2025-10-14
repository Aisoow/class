#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    long int time, n, min;
    cin >> time >> n;
    min = n;
    for (int i = 1; i <= n; ++i)
    {
        if (n < min)
        {
            min = n;
        }
        cin >> n;
    }
    cout << min;
}