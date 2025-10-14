#include <iostream>
using namespace std;

int main()
{
    int s[11] = {}, n, s2[5] = {};
    for (int i = 0; i < 5; i++)
    {
        cin >> n;
        if (s[n] == 1)
        {
            cout << " Please re - enter since the added number is repeated :" << endl;
            i--;
        }
        else
        {
            s2[i] = n;
            s[n]++;
        }
    }
    for (int i = 0; i < 5; i++)
    {
        cout << s2[i];
    }
}
