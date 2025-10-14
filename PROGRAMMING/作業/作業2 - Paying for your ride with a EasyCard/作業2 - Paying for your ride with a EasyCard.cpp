#include <iostream>
using namespace std;
int main()
{
    char t;
    int n, tot=0, distot=0;
    cin >> t >> n;
    char pt = t;
    for (int i = 1; i <= 5; i++)
    {
        if (t != pt)//偵測是否為轉乘/如果是
        {
            if (t == 'A')//檢測是不是MRT
            {
                tot += n;
                distot += n * 0.8 - 8;
            }
            else
            {
                tot += n;
                distot += n - 8;
            }
        }
        else//偵測是否為轉乘/如果不是
        {
            if (t == 'A')//檢測是不是MRT
            {
                tot += n;
                distot += n * 0.8;
            }
            else
            {
                tot += n;
                distot += n;
            }
        }
        pt = t;
        cin >> t >> n;
        cout << tot << distot << endl;
    }
}
