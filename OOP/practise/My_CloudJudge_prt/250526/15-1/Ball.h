#ifndef BALL_H
#define BALL_H
#include <cmath>
#include "GeometricObject.h"
class Ball : public GeometricObject
{
private:
    double radius;

public:
    Ball(double, string);
    ~Ball();
    void setRadius(double);
    double getRadius();
    double getVolume();
    double getArea();
};
#endif