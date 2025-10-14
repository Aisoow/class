#include <iostream>
#include <iomanip>
#include "BMI.h"
using namespace std;
int main()
{
    BMI b1;
    string n;
    double w, h;
    cin >> n >> w >> h;
    b1.setname(n);
    b1.setheight(h);
    b1.setweight(w);
    cout << b1.getname() << fixed << setprecision(2) << b1.getBMI();
}