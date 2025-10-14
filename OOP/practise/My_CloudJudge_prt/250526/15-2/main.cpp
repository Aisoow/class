#include "Ball.h"
#include "Cube.h"
#include "GeometricObject.h"
#include <iomanip>
void display(GeometricObject &g)
{
     cout << ", area:" << g.getArea()
          << ", volume:" << g.getVolume()
          << ", color:" << g.getColor() << endl;
}
int main()
{
     string c1, c2;
     double r, l;
     cin >> r >> c1 >> l >> c2;
     Ball Ball(r, c1);
     Cube Cube(l, c2);

     cout << "Ball" << endl
          << fixed << setprecision(1)
          << "radius:" << Ball.getRadius();
     display(Ball);
     cout << "Cube" << endl
          << fixed << setprecision(1)
          << "length:" << Cube.getLength();
     display(Cube);
}