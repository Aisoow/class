#ifndef STUCARD_H
#define STUCARD_H
#include <iostream>
using namespace std;
class StuCard
{
private:
    string name;
    bool sex;
    double scoreAry[3];

public:
    StuCard(string, bool, double *);
    void setName(string);
    void setSex(bool);
    void setScore(int, double *);
    string getName();
    bool getSex();
    double getScore(int);
};
#endif
