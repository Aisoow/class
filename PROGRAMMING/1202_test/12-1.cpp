#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int m;
    int data[101] = {};
    cin >> m;
    while (m != -1)
    {
        data[m]++;
        cin >> m;
    }
    for (int i = 0; i < 101; i++)
    {
        cout << setw(3) << i << " " << setw(2) << data[i];
    }
}