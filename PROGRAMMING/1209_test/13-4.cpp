#include <iostream>

using namespace std;
int main()
{
    int n = 0, i = 0;
    char s1[100];
    cin >> s1;
    char *sptr = s1;
    while (s1[i] != '\0')
    {
        if (s1[i] == '/')
        {
            if (*sptr + 1 == 'n' || *sptr + 1 == 't' || *sptr + 1 == 'c' || *sptr + 1 == 'b' || *sptr + 1 == 'f')
            {
                n++;
            }
            sptr++;
        }
        sptr++;
    }
    cout << n << endl;
}