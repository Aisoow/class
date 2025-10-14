#ifndef Square_h
#define Square_h
#include "Shape.h"
class Square : public Shape
{
private:
    double edge;

public:
    Square(/* args */);
    Square(double, string);
    void setEdge(double);
    double getEdge();
    double getArea() override;
    double getPerimeter() override;
};
#endif