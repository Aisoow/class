#include "Square.h"
Square::Square(/* args */) {}
Square::Square(double edge, string color)
{
    this->edge = edge;
    setColor(color);
}
void Square::setEdge(double edge)
{
    this->edge = edge;
}
double Square::getEdge()
{
    return edge;
}
double Square::getArea()
{
    return edge * edge;
}
double Square::getPerimeter()
{
    return edge * 4;
}
