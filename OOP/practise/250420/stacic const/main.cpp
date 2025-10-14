#include "Rectangle.h"
#include <iostream>
using namespace std;
int main()
{
    Rectangle r1, r2, r3;
    int width, height;
    cin >> width >> height;
    r1.setWidth(width);
    r1.setHeight(height);
    cin >> width >> height;
    r2.setWidth(width);
    r2.setHeight(height);
    cin >> width >> height;
    r3.setWidth(width);
    r3.setHeight(height);
    cout << r1.getWidth() << " " << r1.getHeight() << " " << r1.getArea() << endl;
    cout << r2.getWidth() << " " << r2.getHeight() << " " << r2.getArea() << endl;
    cout << r3.getWidth() << " " << r3.getHeight() << " " << r3.getArea() << endl;
    cout << Rectangle::getNumOfRect() << " Rectangles" << endl;
}