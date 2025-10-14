#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; ++i)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == 1 || i == n)
            {
                cout << "*";
            }
            else if (j == 1 || j == n)
            {
                cout << "*";
            }
            else if (j == i)
            {
                cout << "*";
            }
            else if (j + i == n + 1)
            {
                cout << "*";
            }
            else
            {
                cout << " ";
            }
        }
        cout << endl;
    }
}