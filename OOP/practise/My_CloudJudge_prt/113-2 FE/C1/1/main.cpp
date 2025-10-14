#include "Birthday.h"
#include "Salary.h"
#include "Staff.h"
int main()
{
    Birthday b1(2002, 3, 2);
    Birthday b2(2003, 5, 4);
    Birthday b3(2000, 10, 8);
    Salary sa1(10, 20);
    Salary sa2(8, 30);
    Salary sa3(3, 4);
    Staff s1("Kirito", b1, sa1);
    Staff s2("Asuna", b2, sa2);
    Staff s3("Alice", b3, sa3);
    string name;
    int year, day, hour;
    cin >> name >> year >> day >> hour;

    s1.setName(name);

    b2.setYear(year);
    s2.setBr(b2);

    b3.setDay(day);
    s3.setBr(b3);

    sa1.setHours(hour);
    sa3.setHours(hour);
    s1.setSa(sa1);
    s3.setSa(sa3);

    s1.print();
    s2.print();
    s3.print();
    cout << "Staff: " << s3.getTime();
}