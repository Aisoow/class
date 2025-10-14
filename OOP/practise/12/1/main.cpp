#include <iostream>
using namespace std;
template <typename T>
void InsertionSort(T list[], int listSize)
{
    for (int i = 1; i < listSize; i++)
    {
        T currentElement = list[i];
        int k;
        for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
        {
            list[k + 1] = list[k];
        }
        list[k + 1] = currentElement;
    }
}
template <typename T>
int BinarySearch(T list[], T key, int listSize)
{
    int low = 0;
    int high = listSize - 1;

    while (high >= low)
    {
        int mid = (low + high) / 2;
        if (key < list[mid])
            high = mid - 1;
        else if (key > list[mid])
            low = mid + 1;
        else
            return mid;
    }

    return -1;
}
int main()
{
    int list1[] = {1, 5, 6, 2, 3, 7, 9, 8, 4};
    double list2[] = {1.1, 5.5, 6.6, 2.2, 3.3, 7.7, 9.9, 8.8, 4.4};
    int n[3] = {};
    double d[3] = {};
    for (int i = 0; i < 3; i++)
    {
        cin >> n[i];
    }
    for (int i = 0; i < 3; i++)
    {
        cin >> d[i];
    }
    cout << "From: ";
    for (int i = 0; i < 8; i++)
    {
        cout << list1[i] << ",";
    }
    cout << list1[8] << endl;
    InsertionSort(list1, 9);
    cout << "To: ";
    for (int i = 0; i < 8; i++)
    {
        cout << list1[i] << ",";
    }
    cout << list1[8] << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << n[i] << " at " << BinarySearch(list1, n[i], 9) << endl;
    }

    cout << "From: ";
    for (int i = 0; i < 8; i++)
    {
        cout << list2[i] << ",";
    }
    cout << list2[8] << endl;
    InsertionSort(list2, 9);
    cout << "To: ";
    for (int i = 0; i < 8; i++)
    {
        cout << list2[i] << ",";
    }
    cout << list2[8] << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << d[i] << " at " << BinarySearch(list2, d[i], 9) << endl;
    }
    system("pause");
    return 0;
}