#include <iostream>
#include <iomanip>
#include "Rectangle.h"
using namespace std;
double sum(Rectangle rectArray[], int size)
{
    int tot = 0;
    for (int i = 0; i < size; i++)
    {
        tot += rectArray[i].getArea();
    }
    return tot;
}
void printRectangleArray(Rectangle rectArray[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << rectArray[i].getWidth() << rectArray[i].getHeight() << rectArray[i].getArea() << endl;
    }
    cout << "Total: " << sum(rectArray, size);
}
int main()
{
    int w, h;
    const int size = 4;
    Rectangle rectArray[size];
    for (int i = 0; i < size; i++)
    {
        cin >> w >> h;
        rectArray[i].setHeight(h), rectArray[i].setWidth(w);
    }
    printRectangleArray(rectArray, size);
}
