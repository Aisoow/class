#include "Cube.h"
Cube::Cube(double length, string color) : length(length)
{
    setColor(color);
}
Cube::~Cube() {}
void Cube::setLength(double length)
{
    this->length = length;
}
double Cube::getLength()
{
    return length;
}
double Cube::getVolume()
{
    return pow(length, 3);
}
double Cube::getArea()
{
    return 6 * pow(length, 3);
}