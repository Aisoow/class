#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, tot = 0;
    cin >> n;
    for (int i = 1; i <= n; ++i)
    {
        int h1, m1, h2, m2, times;
        cin >> h1 >> m1 >> h2 >> m2;
        if (h2 < h1 || (h2 == h1 && m2 < m1))
        {
            times = (h2 + 24 - h1) * 60 + (m2 - m1);
        }
        else
        {
            times = (h2 - h1) * 60 + (m2 - m1);
        }
        tot += times;
        cout << times << endl;
    }
    cout << "Total: " << tot << endl;
}