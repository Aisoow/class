#include "Rectangle.h"
#include <iostream>
#include <iomanip>
using namespace std;
void swapByReference(Rectangle &r1, Rectangle &r2)
{
    Rectangle temp = r1;
    r1 = r2;
    r2 = temp;
}
void swapByPointer(Rectangle *r1, Rectangle *r2)
{
    Rectangle temp = *r1;
    *r1 = *r2;
    *r2 = temp;
}
int main()
{
    double w, h;
    cin >> w >> h;
    Rectangle r1(w, h);
    cin >> w >> h;
    Rectangle r2(w, h);
    cout << "SwapByReference:" << fixed << setprecision(2) << r1.getArea() << " " << r2.getArea() << " to ";
    swapByReference(r1, r2);
    cout << r1.getArea() << " " << r2.getArea() << endl;
    cout << "SwapByPointer:" << fixed << setprecision(2) << r1.getArea() << " " << r2.getArea() << " to ";
    swapByPointer(&r1, &r2);
    cout << r1.getArea() << " " << r2.getArea() << endl;
}