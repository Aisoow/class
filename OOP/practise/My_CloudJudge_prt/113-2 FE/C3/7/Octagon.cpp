#include "Octagon.h"
Octagon::Octagon(/* args */) {}
Octagon::Octagon(double length, string color) : length(length)
{
    setColor(color);
}
void Octagon::setLength(double length)
{
    this->length = length;
}
double Octagon::getLength()
{
    return length;
}
double Octagon::getPerimeter()
{
    return length * 8;
}
void Octagon::print()
{
    cout << fixed << setprecision(2)
         << "Octagon Length:" << length << " Perimeter:"
         << getPerimeter() << " Color:" << getColor() << endl;
}