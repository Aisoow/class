#include "GeometricObject.h"
GeometricObject::GeometricObject()
{
    color = "";
}
GeometricObject::GeometricObject(string color) : color(color) {}
GeometricObject::~GeometricObject() {}
void GeometricObject::setColor(string color)
{
    this->color = color;
}
string GeometricObject::getColor()
{
    return color;
}