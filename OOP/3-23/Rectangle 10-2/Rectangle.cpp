#include "Rectangle.h"
void Rectangle::setWidth(double w)
{
    width = w;
}
void Rectangle::setHeight(double h)
{
    height = h;
}
double Rectangle::getWidth()
{
    return width;
}
double Rectangle::getHeight()
{
    return height;
}
double Rectangle::getArea()
{
    return width * height;
}