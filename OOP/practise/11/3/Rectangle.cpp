#include "Rectangle.h"
#include <iostream>
using namespace std;
int Rectangle::numOfRect = 0;
Rectangle::Rectangle(double w, double h) : width(w), height(h) {}
Rectangle::~Rectangle()
{
    numOfRect--;
}

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
int Rectangle::getNumOfRect()
{
    return numOfRect;
}
void Rectangle::print()
{
    cout << height << " " << width << " " << getArea() << endl;
    numOfRect++;
}