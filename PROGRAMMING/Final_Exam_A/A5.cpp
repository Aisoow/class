#include <iostream>
using namespace std;
int co(int n)
{
    int ans = 0;
    while (n != 0)
    {
        ans += n % 10;
        n /= 10;
    }
    if (ans >= 10)
    {
        return co(ans);
    }
    else
    {
        return ans;
    }
}
int main()
{
    int n;
    cin >> n;
    cout << co(n);
}