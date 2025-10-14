#include <iostream>
using namespace std;
void Forward(int arr[], int count, int f)
{
    for (int i = f; i < count; i++)
    {
        arr[i] = arr[i + 1];
    }
    for (int i = 0; i < count; i++)
    {
        cout << arr[i];
    }
    cout << endl;
}
void Backward(int arr[], int count, int b, int score)
{
    for (int i = b; i < count; i++)
    {
        int temp, old_temp;
        if (i == b)
        {
            old_temp = arr[i];
            arr[i] = score;
        }
        else
        {
            temp = arr[i];
            arr[i] = old_temp;
            old_temp = temp;
        }
    }
    for (int i = 0; i < count; i++)
    {
        cout << arr[i];
    }
    cout << endl;
}
void Print(int arr[], int count)
{
    int f, b, score;
    cin >> f >> b >> score;
    Forward(arr, count, f);
    Backward(arr, count, b, score);
}
int main()
{
    int count;
    cin >> count;
    int arr[100] = {};
    for (int i = 0; i < count; i++)
    {
        cin >> arr[i];
    }
    Print(arr, count);
}