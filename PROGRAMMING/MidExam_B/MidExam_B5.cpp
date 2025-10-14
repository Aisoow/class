#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n;
    cin >> n;

    string hexStr = "";

    while (n != 0)
    {
        int hex = n % 16;
        if (hex < 10)
            hexStr = char(hex + '0') + hexStr;
        else
            hexStr = char(hex - 10 + 'A') + hexStr;
        n /= 16;
    }

    cout << hexStr << endl;
    return 0;
}
