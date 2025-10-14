#include <iostream>
#include <iomanip>
#include "Rectangle.h"
using namespace std;
void sortBySelection(Rectangle rectArr[], Rectangle sortedArr[], int arrSize)
{
    for (int k = 0; k < arrSize; k++)
    {
        sortedArr[k] = rectArr[k];
    }
    for (int i = 0; i < arrSize; i++)
    {
        int min = i;
        for (int j = i + 1; j < arrSize; j++)
        {
            if (sortedArr[j].getArea() < sortedArr[min].getArea())
            {
                min = j;
            }
        }
        if (min != i)
        {
            Rectangle temp = sortedArr[i];
            sortedArr[i] = sortedArr[min];
            sortedArr[min] = temp;
        }
        }
}
int main()
{
    const int arrSize = 10;
    Rectangle rectArr[arrSize], sortedArr[arrSize];
    double width, height;

    for (int i = 0; i < arrSize; i++)
    {
        cin >> width >> height;
        rectArr[i] = Rectangle(width, height);
    }
    sortBySelection(rectArr, sortedArr, arrSize);
    cout << "----- Original Array -----" << endl;
    for (int i = 0; i < arrSize; i++)
    {
        cout << fixed << setprecision(2) << rectArr[i].getArea() << endl;
    }
    cout << "----- Sorted Array -----" << endl;
    for (int i = 0; i < arrSize; i++)
    {
        cout << fixed << setprecision(2) << sortedArr[i].getArea() << endl;
    }
}