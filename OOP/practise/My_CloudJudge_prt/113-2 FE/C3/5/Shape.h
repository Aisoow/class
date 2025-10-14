#ifndef Shape_h
#define Shape_h
#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;
class Shape
{
private:
    string color;

public:
    Shape(/* args */);
    void setColor(string);
    string getColor();
    virtual double getVolume() = 0;
};
#endif