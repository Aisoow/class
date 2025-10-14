#include <iostream>
using namespace std;
void maxAndMin(int *data, int n, int *max, int *min)
{
    *max = *data;
    *min = *data;
    for (int i = 1; i < n; i++)
    {
        if (*max < *(data + i))
        {
            *max = *(data + i);
        }
        if (*min < *(data + i))
        {
            *max = *(data + i);
        }
    }
}
int main()
{
    int min, max, input, n;
    cin >> n;
    int *data = new int[n];

    for (int i = 0; i < n; i++)
    {
        cin >> input;
        *(data + i) = input;
    }

    maxAndMin(data, n, &max, &min);

    delete[] data;
    return 0;
}