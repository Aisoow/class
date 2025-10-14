#ifndef Staff_h
#define Staff_h
#include <iostream>
#include <fstream>
#include <string>
#include "Birthday.h"
#include "Salary.h"
using namespace std;
class Staff
{
private:
    string name;
    Birthday br;
    Salary sa;

public:
    Staff(/* args */);
    Staff(string, Birthday, Salary);
    void setName(string);
    string getName();
    void setBr(Birthday);
    Birthday getBr();
    void setSa(Salary);
    Salary getSa();
    void print(ostream &);
};
#endif