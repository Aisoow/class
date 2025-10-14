#ifndef DATE_H
#define DATE_H
#include <iostream>
using namespace std;
class Date
{
private:
    int month, day, year;

public:
    Date();
    Date(int, int, int);
    void print();
};
#endif
