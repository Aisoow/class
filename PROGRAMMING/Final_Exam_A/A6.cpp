#include <iostream>
using namespace std;
int main()
{
    int a, b;
    int d, c;
    cin >> a >> b >> c >> d;
    for (int i = 0; i < a; i++)
    {
        for (int j = 0; j < b; j++)
        {
            if ((i == c || j == d) && !(i == c && j == d))
            {
                cout << "1";
            }
            else if ((i == c + 1 || i == c - 1) && (j == d + 1 || j == d - 1))
            {
                cout << "1";
            }
            else
            {
                cout << "0";
            }
        }
        cout << endl;
    }
}