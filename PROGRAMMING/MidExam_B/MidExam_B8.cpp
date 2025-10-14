#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int a, b, tot = 0;
    cin >> a >> b;
    int i = a;
    while (i <= b)
    {
        int j = 1, n = 1;
        while (j <= i)
        {
            n *= 2;
            j++;
        }
        i++;
        tot += n;
    }

    cout << tot << endl;
}