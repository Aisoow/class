#include "Rectangle.h"
void setWidth(double w)
{
    width = w;
}

// 設定高度
void setHeight(double h)
{
    height = h;
}
double Rectangle::getwidth()
{
    return width;
}
double Rectangle::getheight()
{
    return height;
}
double Rectangle::getArea()
{
    return width * height;
}
double Rectangle::getPerimeter()
{
    return (width + height) * 2;
}