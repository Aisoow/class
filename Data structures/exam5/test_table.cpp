#include <iostream>
#include <vector>
#include <cmath>
#include <string>
#include <cstdlib>
using namespace std;

vector<vector<int>> getPasswordTable(int number)
{
    srand(number);
    vector<vector<int>> PasswordTable(10, vector<int>(10));
    for (int i = 0; i < 10; ++i)
    {
        for (int j = 0; j < 10; ++j)
        {
            PasswordTable[i][j] = rand() % 100;
        }
    }

    return PasswordTable;
}

int main()
{
    int total = 5242877;
    auto table = getPasswordTable(total);

    cout << "Password Table for " << total << ":\n";
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            cout << table[i][j] << "\t";
        }
        cout << endl;
    }

    cout << "\nSpecific values:\n";
    cout << "[0][5] = " << table[0][5] << endl;
    cout << "[5][2] = " << table[5][2] << endl;
    cout << "[2][4] = " << table[2][4] << endl;
    cout << "[2][8] = " << table[2][8] << endl;
    cout << "[7][7] = " << table[7][7] << endl;
}
