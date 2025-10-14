#include "Circle.h"
#include "Square.h"
void display(Shape &d)
{
     cout << "顏色：" << d.getColor() << endl
          << "體積：" << d.getVolume() << endl;
}
int main()
{
     double r, e;
     string cc, sc;
     cin >> r >> cc >> e >> sc;
     Circle c(r, cc);
     Square s(e, sc);
     cout << fixed << setprecision(1)
          << "=== [圓形] ===" << endl
          << "半徑：" << c.getRadius() << endl;
     display(c);
     cout << fixed << setprecision(1)
          << "=== [正方形] ===" << endl
          << "邊長：" << s.getEdge() << endl;
     display(s);
}