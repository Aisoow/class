#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n, tot = 0;
    cin >> n;
    while (n != -1)
    {
        tot += n;
        cin >> n;
    }
    cout << tot << endl;
}