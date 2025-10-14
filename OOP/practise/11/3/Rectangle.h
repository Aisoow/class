#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle
{
private:
    double height;
    double width;
    static int numOfRect;

public:
    Rectangle(double, double);
    ~Rectangle();
    void setWidth(double);
    void setHeight(double);
    double getWidth();
    double getHeight();
    double getArea();
    static int getNumOfRect();
    void print();
};
#endif