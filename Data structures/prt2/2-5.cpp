#include <iostream>
using namespace std;
int main(int argc, char *argv[])
{
    int Score[3][4][5];
    for (int k = 0; k < 3; k++)
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
                cin >> Score[k][i][j];
    cout << "同學總成績：";
    for (int i = 0; i < 4; i++)
    {
        int sum = 0;
        for (int k = 0; k < 3; k++)
        {
            for (int j = 0; j < 5; j++)
            {
                sum += Score[k][i][j];
            }
        }
        cout << sum;
    }
    cout << " 科目總成績：";
    for (int j = 0; j < 5; j++)
    {
        int sum = 0;
        for (int k = 0; k < 3; k++)
        {
            for (int i = 0; i < 4; i++)
            {
                sum += Score[k][i][j];
            }
        }
        cout << sum;
    }
}