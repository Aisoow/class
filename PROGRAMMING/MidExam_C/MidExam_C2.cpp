#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int bot, top;
    cin >> bot >> top;
    while (bot <= top)
    {
        cout << char(bot);
        bot++;
    }
}