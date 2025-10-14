#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle
{
private:
    double width, height;

public:
    void setWidth(double w), setHeight(double h);
    double getWidth(), getHeight(), getArea();
};
#endif