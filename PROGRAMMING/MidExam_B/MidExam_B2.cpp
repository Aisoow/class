#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, ans = 0, time = 1;
    cin >> n;
    while (n != 0)
    {
        ans += n % 10 * time;
        n /= 10;
        time *= 2;
    }
    cout << ans << endl;
}