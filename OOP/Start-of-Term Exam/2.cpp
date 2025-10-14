#include <iostream>
using namespace std;
int main()
{
    int s[10] = {}, n, max = 0;
    for (int i = 0; i < 10; i++)
    {
        cin >> n;
        s[n]++;
    }
    for (int i = 0; i < 10; i++)
    {
        if (s[i] > max)
        {
            max = s[n];
        }
    }
    cout << "Result: ";
    for (int i = 0; i < 10; i++)
    {
        if (s[i] == max)
        {
            cout << i << " " <<
        }
    }
}