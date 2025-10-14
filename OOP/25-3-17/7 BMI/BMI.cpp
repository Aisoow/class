#include "BMI.h"
void BMI::setheight(double h)
{
    height = h;
}
void BMI::setweight(double w)
{
    weight = w;
}
void BMI::setname(double n)
{
    name = n;
}
double BMI::setBMI()
{
    return weight / (height * height);
}