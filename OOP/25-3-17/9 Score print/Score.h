#ifndef SCORE_H
#define SCORE_H
#include <iostream>
#include <string>
using namespace std;
class Score
{
private:
    string name;
    int math;

public:
    void setName(string n), setMath(int m);
    void print();
    string getName();
    int getMath();
};
#endif