#include <iostream>
using namespace std;
void funA(int num)
{
    bool o = false;
    while (true)
    {
        cout << num;
        if (num == 0)
        {
            if (o)
            {
                cout << endl;
                break;
            }
            o = true;
        }
        num = (num * num) % 1000 / 10;
    }
}
int main()
{
    for (int i = 0; i < 2; i++)
    {
        int n;
        cin >> n;
        funA(n);
    }
    return 0;
}