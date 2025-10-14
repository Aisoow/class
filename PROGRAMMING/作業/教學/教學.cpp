#include <iostream>
using namespace std;
int main()
{
    char a,pa;
    int b,tot=0,distot=0;
    cin >> a >> b;
    pa = a;
    for (int i = 1; i <= 5; i++)
    {
        if (a == pa)//沒轉乘
        {
            if (a == 'A')//搭捷運
            {
                tot += b;
                distot += b * 0.8;
            }
            else
            {
                tot += b;
                distot += b;
            }
        }
        else//有轉乘 -8
        {
            if (a == 'A')//搭捷運
            {
                tot += b;
                distot += b * 0.8 -8;
            }
            else
            {
                tot += b;
                distot += b -8;
            }
        }
        pa = a;
        cin >> a >> b;
        cout << tot /*沒打折總和*/ << distot/*打折後總和*/ << endl;
    }
}
