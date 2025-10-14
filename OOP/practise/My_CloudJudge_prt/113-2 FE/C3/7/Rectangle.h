#ifndef Rectangle_h
#define Rectangle_h
#include "Shape.h"
class Rectangle : public Shape
{
private:
    double height;
    double weight;

public:
    Rectangle(/* args */);
    Rectangle(double, double, string);
    void setHeight(double);
    double getHeight();
    void setWeight(double);
    double getWeight();
    double getPerimeter();
    void print();
};
#endif