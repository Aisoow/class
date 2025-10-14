#ifndef Birthday_h
#define Birthday_h
#include <iostream>
using namespace std;
class Birthday
{
private:
    int year;
    int month;
    int day;

public:
    Birthday();
    Birthday(int, int, int);
    void setYear(int);
    int getYear() const;
    void setMonth(int);
    int getMonth() const;
    void setDay(int);
    int getDay() const;
    void print();
};
#endif