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
    void setRadius(double);
    double getRadius();
    double getVolume() const override;
    double getArea() const override;
};
#endif