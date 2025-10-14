#include "Octagon.h"
#include "Rectangle.h"
void display(Shape)
{
}
int main()
{
    double l, w, h;
    string oc, rc;
    cin >> h >> w >> rc >> l >> oc;
    cout << h << w << rc << l << oc << endl;
    Octagon o(l, oc);
    Rectangle r(h, w, rc);
    r.print();
    o.print();
}