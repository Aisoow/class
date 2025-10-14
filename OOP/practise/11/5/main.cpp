#include <iostream>
#include <iomanip>
#include "Rectangle.h"
using namespace std;
Rectangle *sortBySelection(Rectangle rectInAndOut[], int size)
{
    Rectangle *sortedArr = new Rectangle[size];
    for (int i = 0; i < size; i++)
    {
        sortedArr[i] = rectInAndOut[i];
    }
    for (int i = 0; i < size; i++)
    {
        int min = i;
        for (int j = i + 1; j < size; j++)
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
    for (int i = 0; i < size; i++)
    {
        rectInAndOut[i] = sortedArr[i];
    }
    return sortedArr;
}
int main()
{
    const int arrSize = 10;
    Rectangle rectArr[arrSize];
    double width, height;

    for (int i = 0; i < arrSize; i++)
    {
        cin >> width >> height;
        rectArr[i] = Rectangle(width, height);
    }

    cout << "----- Original Array -----" << endl;
    for (int i = 0; i < arrSize; i++)
    {
        cout << fixed << setprecision(2) << rectArr[i].getArea() << endl;
    }
    Rectangle *returnArray = sortBySelection(rectArr, arrSize);
    cout << "----- Sorted Array -----" << endl;
    for (int i = 0; i < arrSize; i++)
    {
        cout << fixed << setprecision(2) << rectArr[i].getArea() << endl;
    }
    cout << "----- Return Sorted Array -----" << endl;
    for (int i = 0; i < arrSize; i++)
    {
        cout << fixed << setprecision(2) << returnArray[i].getArea() << endl;
    }
}