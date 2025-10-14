#include <iostream>
using namespace std;

int main()
{
    bool d;
    int n;
    cin >> n;
    for (int i = 2; i <= n; i++)
    {
        d = true;
        for (int b = 2; b * b <= i; b++)
        {
            if (i % b == 0)
            {
                d = false;
                break;
            }
        }
        if (d)
        {
            cout << i << endl;
        }
    }
    return 0;
}
