#include <iostream>
#include <iomanip>
using namespace std;

class Rectangle
{
public:
    double width;
    double height;

    double getArea()
    {
        return width * height;
    }
    double getPerimeter()
    {
        return (width + height) * 2;
    }
};

int main()
{
    Rectangle Rectangle1;
    Rectangle Rectangle2;
    cin >> Rectangle1.width >> Rectangle1.height >> Rectangle2.width >> Rectangle2.height;
    cout << fixed << setprecision(1) <<
}
