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
double Circle::getPerimeter()
{
    return radius * 2 * 3.14;
}
