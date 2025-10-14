#include "Salary.h"
Salary::Salary(/* args */) {}
Salary::Salary(int hours, int workDay) : hours(hours), workDay(workDay) {}
void Salary::setHours(int hours)
{
    this->hours = hours;
}
int Salary::getHours() const
{
    return hours;
}
void Salary::setWorkDay(int workDay)
{
    this->workDay = workDay;
}
int Salary::getWorkDay() const
{
    return workDay;
}
int Salary::getMonthlySalary() const
{
    return 168 * hours * workDay;
}
void Salary::print()
{
    cout << Salary::getMonthlySalary() << " ";
}