#ifndef Salary_h
#define Salary_h
#include <iostream>
using namespace std;
class Salary
{
private:
    int hours;
    int workDay;

public:
    Salary(/* args */);
    Salary(int, int);
    void setHours(int);
    int getHours() const;
    void setWorkDay(int);
    int getWorkDay() const;
    int getMonthlySalary() const;
    void print();
};
#endif
