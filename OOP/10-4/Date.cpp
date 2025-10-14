#include "Date.h"
#include <iostream>
using namespace std;
Date::Date() {}
Date::Date(int m, int d, int y) : month(m), day(d), year(y) {}
void Date::print()
{
    cout << month << "/" << day << "/" << year;
}