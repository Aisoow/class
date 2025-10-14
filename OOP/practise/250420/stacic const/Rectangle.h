#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle
{
private:
    double height;
    double width;
    static int numOfRect;

public:
    void setWidth(double);
    void setHeight(double);
    double getWidth() const;
    double getHeight() const;
    double getArea() const;
    static int getNumOfRect();
};
#endif