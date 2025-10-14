
#include "CircleWithPrivateDataFields.h"

// Construct a default circle object
Circle::Circle()
{
	radius = 1;
}

// Construct a circle object
Circle::Circle(double newRadius)
{
	radius = newRadius;
}

// Return the area of this circle
double Circle::getArea()
{
	return radius * radius * 3.14159;
}

// Return the radius of this circle
double Circle::getRadius()
{
	return radius;
}

// Set a new radius
void Circle::setRadius(double newRadius)
{
	radius = (newRadius >= 0) ? newRadius : 0;

	/*三元運算子語法：
		(條件) ? 值1 : 值2;
		如果 條件 為 true，則回傳 值1。
		如果 條件 為 false，則回傳 值2。
		*/

}