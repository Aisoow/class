#include <iostream>
#include <iomanip>
#include "Rectangle.h"
using namespace std;
int main()
{
    Rectangle Rectangle1;
    Rectangle Rectangle2;
    cin >> Rectangle1.width >> Rectangle1.height >> Rectangle2.width >> Rectangle2.height;
    cout << fixed << setprecision(2) << Rectangle1.getArea() << Rectangle1.getPerimeter() << endl;
    cout << fixed << setprecision(2) << Rectangle2.getArea() << Rectangle2.getPerimeter() << endl;
    Rectangle2.width = 2.5;
    Rectangle2.height = 5;
    cout << fixed << setprecision(2) << Rectangle2.getArea() << Rectangle2.getPerimeter() << endl;
}
