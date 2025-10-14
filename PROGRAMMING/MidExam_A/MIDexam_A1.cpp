#include <iostream>
using namespace std;
int main()
{
    int n, tot;
    cin >> n;
    while (n != 0)
    {
        tot += n % 10;
        n /= 10;
    }
    cout << tot << endl;
}