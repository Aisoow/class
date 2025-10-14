#include <iostream>
using namespace std;
int reverseNumber(int n)
{
    int temp = 0;
    while (n != 0)
    {
        temp = (temp * 10) + (n % 10);
        n /= 10;
    }
    return temp;
}
int main()
{
    for (int i = 0; i < 2; i++)
    {
        int n = 0, c = 0;
        cin >> n;
        while (reverseNumber(n) != n)
        {
            c++;
            n += reverseNumber(n);
        }
        cout << "Total:" << c << endl
             << " Result:" << n << endl;
    }
}