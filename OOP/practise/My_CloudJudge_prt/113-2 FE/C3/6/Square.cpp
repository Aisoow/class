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
double Square::getSumOfAngles()
{
    return 360.0;
}
void Square::toString()
{
    cout << fixed << setprecision(1)
         << "=== [正方形] ===" << endl
         << "內角和：" << getSumOfAngles() << endl
         << "邊長：" << edge << endl;
}