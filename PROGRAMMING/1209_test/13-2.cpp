#include <iostream>

using namespace std;
int main()
{
    int up = 0, low = 0;
    char s1[100];
    cin >> s1;
    char *sptr = s1;
    while (*sptr != '\0')
    {
        if (*sptr >= 'a' && *sptr <= 'z')
        {
            low++;
        }
        else
        {
            up++;
        }
        *sptr++;
    }
    cout << up << " " << low << endl;
}