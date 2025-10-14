#include "Rectangle.h"
Rectangle::Rectangle(/* args */) {}
Rectangle::Rectangle(double height, double weight, string color)
{
    this->height = height;
    this->weight = weight;
    setColor(color);
}
void Rectangle::setHeight(double height)
{
    this->height = height;
}
double Rectangle::getHeight()
{
    return height;
}
void Rectangle::setWeight(double weight)
{
    this->weight = weight;
}
double Rectangle::getWeight()
{
    return weight;
}
double Rectangle::getPerimeter()
{
    return (height + weight) * 2.0;
}
void Rectangle::print()
{
    cout << fixed << setprecision(2)
         << "Rectangle Height:" << height
         << " Weight:" << weight
         << " Perimeter:" << getPerimeter()
         << " Color:" << getColor() << endl;
}