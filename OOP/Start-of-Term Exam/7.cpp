#include <iostream>
using namespace std;
int main()
{
    int crime = 0;
    int city[100][100];
    int x_size, y_size;
    int times;
    cin >> y_size >> x_size >> times;
    for (int y = 0; y < y_size; y++)
    {
        for (int x = 0; x < x_size; x++)
        {
            city[y][x] = 101;
        }
    }
    for (int t = 0; t < times; t++)
    {
        int x_where, y_where;
        cin >> y_where >> x_where;
        for (int y = y_where - 1; y <= y_where + 1; y++)
        {
            for (int x = x_where - 1; x <= x_where + 1; x++)
            {
                if ((x >= 0 && y >= 0) && (x < x_size && y < y_size))
                {
                    city[y][x] -= 5;
                }
            }
        }
    }
    for (int y = 0; y < y_size; y++)
    {
        for (int x = 0; x < x_size; x++)
        {
            if (city[y][x] < 101)
            {
                if (city[y][x] < 0)
                {
                    crime += 6666;
                }
                else if (city[y][x] >= 50)
                {
                    crime += 87;
                }
                else
                {
                    crime += 777;
                }
            }
        }
    }
    cout << crime;
}