#include <iostream>
using namespace std;
int main(int argc, char *argv[])
{
    int Score[4][5];
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 5; j++)
            cin >> Score[i][j];
    for (int i = 0; i < 4; i++)
    {
        float avg = 0.0;
        for (int j = 0; j < 5; j++)
        {
            avg += Score[i][j];
        }
        cout << avg / 5;
    }
}