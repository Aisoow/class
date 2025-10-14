#include "Circle.h"
#include "Square.h"
void display(Shape &d)
{
     d.toString();
     cout << fixed << setprecision(1)
          << "顏色：" << d.getColor() << endl
          << "面積：" << d.getArea() << endl;
}
int main()
{
     double r, e;
     string cc, sc;
     cin >> r >> cc >> e >> sc;
     Circle c(r, cc);
     Square s(e, sc);
     display(c);
     display(s);
}