#ifndef GEOMETRICOBJECT_H
#define GEOMETRICOBJECT_h
#include <iostream>
using namespace std;
class GeometricObject
{
private:
    string color;

public:
    GeometricObject();
    GeometricObject(string);
    ~GeometricObject();
    void setColor(string);
    string getColor();
};
#endif