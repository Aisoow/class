#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

int main(int argc, char *argv[])
{
    int n;
    cin >> n;
    int avg = 0, sc;
    for (int i = 0; i < n; i++)
    {
        cin >> sc;
        avg += sc;
    }
    avg /= n;
    if (avg >= 60)
    {
        cout << "及格";
    }
    else
    {
        cout << "不及格"
    }
    return 0;
}