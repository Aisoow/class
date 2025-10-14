#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, tot = 0;
    cin >> n;
    while (n != 0)
    {
        tot++;
        n /= 10;
    }
    cout << tot << endl;
}