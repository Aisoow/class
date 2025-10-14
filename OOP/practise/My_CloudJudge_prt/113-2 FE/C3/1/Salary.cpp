#include "Salary.h"
Salary::Salary(/* args */) {}
Salary::Salary(int hours, int workDay) : hours(hours), workDay(workDay) {}
void Salary::setHours(int hours)
{
    this->hours = hours;
}
int Salary::getHours()
{
    return hours;
}
void Salary::setWorkDay(int workDay)
{
    this->workDay = workDay;
}
int Salary::getWorkDay()
{
    return workDay;
}
int Salary::getMonthlySalary()
{
    return 168 * hours * workDay;
}
void Salary::print(ostream &o)
{
    o << Salary::getMonthlySalary();
}