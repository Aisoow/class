#include "rectangle.h"
double width;
double height;
double rectangle::getArea()
{
    return width * height;
}
double rectangle::getPerimeter()
{
    return (width + height) * 2;
}