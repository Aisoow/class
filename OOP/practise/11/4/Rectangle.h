#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle
{
private:
    double height;
    double width;

public:
    Rectangle();
    Rectangle(double, double);
    void setWidth(double);
    void setHeight(double);
    double getWidth();
    double getHeight();
    double getArea();
};
#endif