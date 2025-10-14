#include <iostream>
using namespace std;
int main()
{
    int point = 0, m, temp = 0;
    int baseBag[4] = {};
    int out = 0;
    while (out != 3)
    {
        cin >> m;
        if (m == -1)
        {
            out++;
        }
        else
        {
            if (m == 4)
            {
                point++;
            }
            for (int i = 1; i < 4; i++)
            {
                if (baseBag[i] == 1)
                {
                    temp = i + m;
                    if (temp >= 4)
                    {
                        point++;
                        baseBag[i] = 0;
                    }
                    else
                    {
                        baseBag[i] = 0;
                        baseBag[temp] = 1;
                    }
                }
            }
            if (m < 4 && m >= 0)
            {
                baseBag[m] = 1;
            }
        }
    }
    cout << "Point: " << point << endl;
}