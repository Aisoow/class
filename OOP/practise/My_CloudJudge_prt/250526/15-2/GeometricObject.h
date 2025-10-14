#ifndef GEOMETRICOBJECT_H
#define GEOMETRICOBJECT_H
#include <iostream>
#include <string>
using namespace std;
class GeometricObject
{
private:
    string color;

public:
    GeometricObject();
    GeometricObject(string);
    void setColor(string);
    string getColor();
    virtual double getVolume() = 0;
    virtual double getArea() = 0;
};
#endif