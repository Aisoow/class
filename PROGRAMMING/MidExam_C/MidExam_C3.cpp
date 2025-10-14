#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int id, sale;
    double p1, p2, p3, p4, p5;
    p1 = p2 = p3 = p4 = p5 = 0;
    cin >> id;
    while (id != -1)
    {
        cin >> sale;
        switch (id)
        {
        case 1:
            p1 += sale * 2.98;
            break;
        case 2:
            p2 += sale * 4.50;
            break;
        case 3:
            p3 += sale * 9.98;
            break;
        case 4:
            p4 += sale * 4.49;
            break;
        case 5:
            p5 += sale * 6.87;
            break;
        }
        cin >> id;
    }
    cout << setprecision(2) << fixed << p1 << " " << p2 << " " << p3 << " " << p4 << " " << p5 << " " << " " << p1 + p2 + p3 + p4 + p5 << endl;
}