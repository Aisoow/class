#ifndef Birthday_h
#define Birthday_h
#include <iostream>
#include <fstream>
using namespace std;
class Birthday
{
private:
    int year;
    int month;
    int day;

public:
    Birthday(/* args */);
    Birthday(int, int, int);
    void setYear(int);
    int getYear();
    void setMonth(int);
    int getMonth();
    void setDay(int);
    int getDay();
    void print(ostream &);
};
#endif