#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int num;
    cin >> num;
    while (num != 1)
    {
        cout << num << ", ";
        if (num % 2 == 0)
        {
            num /= 2;
        }
        else
        {
            num = num * 3 + 1;
        }
    }
    cout << num << endl;
}