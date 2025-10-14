#include <iostream>
using namespace std;
int reverseNumber(int number)
{
    int n = 0;
    while (number != 0)
    {
        n = (n * 10) + (number % 10);
        number /= 10;
    }
    return n;
}
int main()
{
    for (int i = 0; i < 2; i++)
    {
        int n, c = 0;
        cin >> n;
        while (reverseNumber(n) != n)
        {
            n += reverseNumber(n);
            c++;
        }
        cout << "Total:" << c << endl
             << " Result:" << n << endl;
    }
}
