#include <iostream>
using namespace std;

int sum(int *arr, int arr_size)
{
    int tot = 0;
    for (int i = 0; i < arr_size; i++)
    {
        tot += arr[i];
    }
    return tot;
}

int main()
{
    int arr_size;
    cin >> arr_size;
    int *arr = new int[arr_size];
    for (int i = 0; i < arr_size; i++)
    {
        cin >> arr[i];
    }
    cout << sum(arr, arr_size) << endl;
}