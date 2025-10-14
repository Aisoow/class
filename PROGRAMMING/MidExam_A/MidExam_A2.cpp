#include <iostream>
using namespace std;
int main()
{
    int tot, n;
    cin >> n;
    for (int i = 1; i <= n; ++i)
    {
        tot += i;
    }
    cout << tot << endl;
}