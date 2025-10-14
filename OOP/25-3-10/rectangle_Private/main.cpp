#include <iostream>
#include <iomanip>
#include "Rectangle.h"
using namespace std;
int main()
{
    double w, h;
    Rectangle Rectangle1, Rectangle2;

    cin >> w >> h;
    Rectangle1.setWidth(w);
    Rectangle1.setHeight(h);

    cin >> w >> h;
    Rectangle2.setWidth(w);
    Rectangle2.setHeight(h);

    cout << fixed << setprecision(2) << Rectangle1.getArea() << Rectangle1.getPerimeter() << endl;
    cout << Rectangle2.getArea() << Rectangle2.getPerimeter() << endl;

    Rectangle2.setWidth(2.5);
    Rectangle2.setHeight(5);

    cout << Rectangle2.getArea() << Rectangle2.getPerimeter() << endl;
}
