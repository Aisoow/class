#ifndef CUBE_H
#define CUBE_H
#include "GeometricObject.h"
#include <cmath>
class Cube : public GeometricObject
{
private:
    double length;

public:
    Cube(double, string);
    ~Cube();
    void setLength(double);
    double getLength();
    double getVolume();
    double getArea();
};
#endif