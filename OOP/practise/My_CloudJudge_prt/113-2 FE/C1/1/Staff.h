#ifndef Staff_h
#define Staff_h
#include <iostream>
#include "Salary.h"
#include "Birthday.h"
using namespace std;
class Staff
{
private:
    string name;
    Birthday br;
    Salary sa;
    static int time;

public:
    Staff(/* args */);
    Staff(string, Birthday, Salary);
    void setName(string);
    string getName() const;
    void setBr(Birthday);
    Birthday getBr() const;
    void setSa(Salary);
    Salary getSa() const;
    int getTime() const;
    void print();
};
#endif