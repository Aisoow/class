#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int times;
    cin >> times;
    for (int i = 1; i <= times; ++i)
    {
        int p, m;
        cin >> p >> m;
        if ((p + m) % 2 != 0 || (p - m) % 2 != 0 || p < m)
        {
            cout << "Impossible" << endl;
        }
        else
        {
            int sA = (p + m) / 2;
            int sB = (p - m) / 2;
            if (sA >= 0 && sB >= 0)
            {
                cout << sA << " " << sB << endl;
            }
            else
            {
                cout << "Impossible" << endl;
            }
        }
    }
}