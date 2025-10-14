#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < n; ++j)
        {
            if (j <= i)
            {
                cout << char((j - i) * -1 + 'A');
            }
            else
            {
                cout << char(j - i + 'A');
            }
        }
        cout << endl;
    }
}