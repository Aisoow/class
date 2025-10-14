#include <iostream>
using namespace std;
int main()
{
    int s1[5] = {};
    for (int i = 0; i < 5; i++)
    {
        cin >> s1[i];
        for (int j = 0; j < i; j++)
        {
            if (s1[i] == s1[j])
            {
                i--;
                cout << "Please re - enter since the added number is repeated:" << endl;
            }
        }
    }
    for (int i = 0; i < 5; i++)
    {
        cout << s1[i];
    }
}