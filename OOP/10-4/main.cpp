#include "Date.h"
#include "Student.h"
#include <iostream>
using namespace std;
int main()
{
    Date birth1(6, 1, 1999), birth2(10, 8, 1997);
    Student student1("John", birth1, 90), student2("Marry", birth2, 80);
    string n;
    int m, d, y;
    cin >> n >> m >> d >> y;
    student1.setName(n);
    student2.setDate(Date(m, d, y));
    student1.print();
    student2.print();
}