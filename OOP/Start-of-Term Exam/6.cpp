#include <iostream>
using namespace std;
int main()
{
    int x_size, y_size, x_where, y_where;
    cin >> y_size >> x_size >> y_where >> x_where;
    int arr[100][100] = {0};
    for (int y = 0; y < y_size; y++)
    {
        for (int x = 0; x < x_size; x++)
        {
            if ((y == y_where && x != x_where) || (y != y_where && x == x_where))
            {
                arr[y][x] = 1;
            }
            if ((x == x_where + 1 || x == x_where - 1) && (y == y_where + 1 || y == y_where - 1))
            {
                arr[y][x] = 1;
            }
        }
    }
    for (int y = 0; y < y_size; y++)
    {
        for (int x = 0; x < x_size; x++)
        {
            cout << arr[y][x] << " ";
        }
        cout << endl;
    }
}