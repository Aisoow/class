#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int c, i = 1;
    cin >> c;
    while (i <= c)
    {
        long int n, ans = 0;
        cin >> n;
        while (n != 0)
        {
            ans = (ans * 10) + n % 10;
            n /= 10;
        }
        cout << ans << endl;
        i++;
    }
}