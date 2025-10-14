#include <iostream>
using namespace std;
int main()
{
    int a, b, num;
    cin >> a >> b;
    num = a - b;
    if (num < 0)
    {
        num *= -1;
    }
    int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const char *sym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    for (int i = 0; i < 13 && num > 0; i++)
    {
        while (num >= val[i])
        {
            cout << sym[i];
            num -= val[i];
        }
    }
    cout << endl;
    return 0;
}