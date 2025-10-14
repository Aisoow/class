#ifndef Circle_h
#define Circle_h
#include "Shape.h"
class Circle : public Shape
{
private:
    double radius;

public:
    Circle(/* args */);
    Circle(double, string);
    void setRadius(double);
    double getRadius();
    void toString() override;
    double getArea() override;
};
#endif