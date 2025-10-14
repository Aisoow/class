#include "Rectangle.h"
#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double w, h;
    cin >> w >> h;
    Rectangle r1(w, h);
    cin >> w >> h;
    Rectangle r2(w, h);
    cout << "SwapByReference:" << fixed << setprecision(2) << r1.getArea() << " " << r2.getArea() << " to ";
    r1.swapByReference(r2);
    cout << r1.getArea() << " " << r2.getArea() << endl;
    cout << "SwapByPointer:" << fixed << setprecision(2) << r1.getArea() << " " << r2.getArea() << " to ";
    r1.swapByPointer(&r2);
    cout << r1.getArea() << " " << r2.getArea() << endl;
}