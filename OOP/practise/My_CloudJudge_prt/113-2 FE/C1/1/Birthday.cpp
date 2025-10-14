#include "Birthday.h"
Birthday::Birthday() {}
Birthday::Birthday(int year, int month, int day) : year(year), month(month), day(day) {}
void Birthday::setYear(int year)
{
    this->year = year;
}
int Birthday::getYear() const
{
    return year;
}
void Birthday::setMonth(int month)
{
    this->month = month;
}
int Birthday::getMonth() const
{
    return month;
}
void Birthday::setDay(int day)
{
    this->day = day;
}
int Birthday::getDay() const
{
    return day;
}
void Birthday::print()
{
    cout << year << "/" << month << "/" << day << " ";
}