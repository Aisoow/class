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
    void setLength(double);
    double getLength();
    double getVolume() override;
    double getArea() override;
};
#endif