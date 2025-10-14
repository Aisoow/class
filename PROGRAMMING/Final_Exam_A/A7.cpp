#include <iostream>
using namespace std;
int main()
{
    int x, y, count, wx, wy, trial = 0;
    cin >> x >> y >> count;
    int place[100][100] = {};
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            place[i][j] = 101;
        }
    }
    for (int c = 0; c < count; c++)
    {
        cin >> wx >> wy;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if ((i <= wx + 1 && i >= wx - 1) && (j <= wy + 1 && j >= wy - 1))
                {
                    place[i][j] -= 5;
                }
            }
        }
    }
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            if (place[i][j] != 101)
            {

                if (place[i][j] >= 50)
                {
                    trial += 87;
                }
                else if (place[i][j] < 0)
                {
                    trial += 6666;
                }
                else
                {
                    trial += 777;
                }
            }
        }
    }
    cout << trial << endl;
}