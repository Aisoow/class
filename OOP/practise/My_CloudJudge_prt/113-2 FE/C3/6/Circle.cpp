#include "Circle.h"
Circle::Circle(/* args */) {}
Circle::Circle(double radius, string color)
{
    this->radius = radius;
    setColor(color);
}
void Circle::setRadius(double radius)
{
    this->radius = radius;
}
double Circle::getRadius()
{
    return radius;
}
double Circle::getArea()
{
    return radius * radius * 3.14;
}
void Circle::toString()
{
    cout << fixed << setprecision(1)
         << "=== [圓形] ===" << endl
         << "半徑：" << radius << endl;
}
