#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle
{
private:
    double width;
    double height;

public:
    void setHeight(double h);
    void setWidth(double w);
    double getwidth();
    double getheight();
    double getArea();
    double getPerimeter();
};
#endif