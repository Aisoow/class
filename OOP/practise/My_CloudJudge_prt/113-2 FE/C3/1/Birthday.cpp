#include "Birthday.h"
Birthday::Birthday(/* args */) {}
Birthday::Birthday(int year, int month, int day) : year(year), month(month), day(day) {}
void Birthday::setYear(int year)
{
    this->year = year;
}
int Birthday::getYear()
{
    return year;
}
void Birthday::setMonth(int month)
{
    this->month = month;
}
int Birthday::getMonth()
{
    return month;
}
void Birthday::setDay(int day)
{
    this->day = day;
}
int Birthday::getDay()
{
    return day;
}
void Birthday::print(ostream &o)
{
    o << year << "/" << month << "/" << day;
}