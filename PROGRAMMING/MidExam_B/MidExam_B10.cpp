#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, tot = 0;
    cin >> n;
    for (int a = 1; a <= n; ++a)
    {
        for (int b = 1; b < a; ++b)
        {
            for (int c = 1; c < b; ++c)
            {
                if (a * a == b * b + c * c)
                {
                    tot++;
                }
            }
        }
    }
    cout << tot << endl;
}