#include <iostream>
using namespace std;

int n;

void guessNumber(int ans, int num[])
{
    for (int i = 0; i < n; i++)
    {
        int a = 0, b = 0;
        int temp1 = ans;
        for (int x = 0; x < 4; x++)
        {
            int temp2 = num[i];
            for (int y = 0; y < 4; y++)
            {
                if (temp1 % 10 == temp2 % 10)
                {
                    if (x == y)
                    {
                        a++;
                    }
                    else
                    {
                        b++;
                    }
                }
                temp2 /= 10;
            }
            temp1 /= 10;
        }
        cout << a << "A" << b << "B" << endl;
    }
}

int main()
{
    int ans, num[100];
    cin >> ans;
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> num[i];
    guessNumber(ans, num);
}
