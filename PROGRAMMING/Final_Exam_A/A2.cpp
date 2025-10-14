#include <iostream>
using namespace std;
int main()
{
    int s[10] = {};
    int n;
    for (int i = 0; i < 10; i++)
    {
        cin >> n;
        s[n]++;
    }
    int max = s[0];
    for (int i = 1; i < 10; i++)
    {
        if (max < s[i])
        {
            max = s[i];
        }
    }
    cout << "Result :";
    for (int i = 0; i < 10; i++)
    {
        if (max == s[i])
        {
            cout << i;
        }
    }
}