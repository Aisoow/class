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
double Circle::getVolume()
{
    return pow(radius, 3) * 3.14;
}
