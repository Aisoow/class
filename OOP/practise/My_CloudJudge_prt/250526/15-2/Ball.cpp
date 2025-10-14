#include "Ball.h"
Ball::Ball(double radius, string color) : radius(radius)
{
    setColor(color);
}
void Ball::setRadius(double radius)
{
    this->radius = radius;
}
double Ball::getRadius()
{
    return radius;
}
double Ball::getVolume()
{
    return (4 / 3) * 3.14159 * pow(radius, 3);
}
double Ball::getArea()
{
    return 4 * 3.14159 * pow(radius, 2);
}