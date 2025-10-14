#include <iostream>
#include "circle.h"
using namespace std;

int main() {
    Circle circle1(1.0);
    Circle circle2(25);
    Circle circle3(125);

    cout << "The area of the circle of radius "
        << circle1.getRadius() << " is " << circle1.getArea() << endl;
    cout << "The area of the circle of radius "
        << circle2.getRadius() << " is " << circle2.getArea() << endl;
    cout << "The area of the circle of radius "
        << circle3.getRadius() << " is " << circle3.getArea() << endl;

    // **修改 circle2 的半徑（使用 setRadius()）**
    circle2.setRadius(100);
    cout << "The area of the circle of radius "
        << circle2.getRadius() << " is " << circle2.getArea() << endl;

    return 0;
}
