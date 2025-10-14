#include "Ball.h"
#include "Cube.h"
#include "GeometricObject.h"
#include <iomanip>
int main()
{
    string c1, c2;
    double r, l;
    cin >> r >> c1 >> l >> c2;
    cout << r << " " << c1 << " " << l << " " << c2 << " " << endl;
    Ball Ball(r, c1);
    Cube Cube(l, c2);

    cout << "Ball" << endl
         << fixed << setprecision(1)
         << "radius:" << Ball.getRadius()
         << ", area:" << Ball.getArea()
         << ", volume:" << Ball.getVolume()
         << ", color:" << Ball.getColor() << endl;
    cout << "Cube" << endl
         << fixed << setprecision(1)
         << "length:" << Cube.getLength()
         << ", area:" << Cube.getArea()
         << ", volume:" << Cube.getVolume()
         << ", color:" << Cube.getColor() << endl;
}