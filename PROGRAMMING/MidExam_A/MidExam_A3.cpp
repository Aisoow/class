#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double c, f;
    cin >> f;
    c = (f - 32) / 9 * 5;
    cout << setprecision(3) << fixed << c << endl;
}