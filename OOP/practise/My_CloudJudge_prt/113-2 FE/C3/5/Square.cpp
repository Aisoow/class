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
double Square::getVolume()
{
    return pow(edge, 3);
}
