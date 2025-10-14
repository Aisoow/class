#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double s, h, w;
    cin >> h >> s;
    if (s == 1)
    {
        cout << setprecision(1) << fixed << (h - 80) * 0.7 << endl;
    }
    else
    {
        cout << setprecision(1) << fixed << (h - 70) * 0.6 << endl;
    }
}