#include <iostream>

using namespace std;
int main()
{
    char s1[100];
    cin >> s1;
    char *sptr = s1;
    while (*sptr != '\0')
    {
        if (*sptr >= 'a' && *sptr <= 'z')
        {
            *sptr -= 32;
        }
        *sptr++;
    }
    cout << s1 << endl;
}