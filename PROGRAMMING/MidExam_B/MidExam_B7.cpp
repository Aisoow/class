#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int a, b, i = 10, c;
    cin >> a >> b >> c;
    while (i <= 100)
    {
        if (i % 3 == a && i % 5 == b && i % 7 == c)
        {
            cout << i << endl;
            return 0;
        }
        i++;
    }
    cout << "No answer!!!" << endl;
    return 0;
}