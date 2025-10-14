#ifndef DATE_H
#define DATE_H
class Date
{
private:
    int month;
    int day;
    int year;

public:
    Date(int, int, int);
    void print();
};
#endif
