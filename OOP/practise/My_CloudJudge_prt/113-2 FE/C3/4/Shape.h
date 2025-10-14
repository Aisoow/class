#ifndef Shape_h
#define Shape_h
#include <iostream>
#include <iomanip>
using namespace std;
class Shape
{
private:
    string color;

public:
    Shape(/* args */);
    void setColor(string);
    string getColor();
    virtual double getArea() = 0;
    virtual double getPerimeter() = 0;
};
#endif