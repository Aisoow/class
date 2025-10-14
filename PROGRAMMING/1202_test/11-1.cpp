#include <iostream>
#include <iomanip>

using namespace std;
const int rows = 4;
const int columns = 4;

int sumOfElements(int array[][columns], int tl_row, int tl_column, int dr_row, int dr_column)
{
    int tot = 0;
    for (int i = tl_row; i <= dr_row; i++)
    {
        for (int j = tl_column; j <= dr_column; j++)
        {
            tot += array[i][j];
        }
    }
    return tot;
}
int main()
{

    int array[rows][columns];
    int tl_row, tl_column, dr_row, dr_column;

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            cin >> array[i][j];
        }
    }
    cin >> tl_row >> tl_column >> dr_row >> dr_column;

    cout << sumOfElements(array, tl_row, tl_column, dr_row, dr_column);
}