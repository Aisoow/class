#ifndef Salary_h
#define Salary_h
#include <iostream>
#include <fstream>
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
    int getHours();
    void setWorkDay(int);
    int getWorkDay();
    int getMonthlySalary();
    void print(ostream &);
};
#endif