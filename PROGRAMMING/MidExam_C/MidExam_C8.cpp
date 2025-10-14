#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int layer;
    cin >> layer;
    int word_num = 1;
    for (int i = 1; i < layer; ++i)
    {
        word_num += 2;
    }
    int mid = word_num / 2;
    for (int i = 0; i < layer; ++i)
    {
        int k = 0;
        for (int j = 0; j < word_num; ++j)
        {
            if (j >= i && j < word_num - i)
            {
                if (j < mid)
                {
                    cout << char(65 + k);
                    k++;
                }
                else if (j > mid)
                {
                    k--;
                    cout << char(65 + k);
                }
                else
                {
                    cout << char(65 + k);
                }
            }
            else
            {
                cout << "*";
            }
        }
        cout << endl;
    }
}