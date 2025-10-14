#ifndef STUDENT_H
#define STUDENT_H
#include "Date.h"
#include <string>
#include <iostream>
using namespace std;
class Student
{
private:
    string name;
    Date birthDay;
    int score;

public:
    Student(string, Date, int);
    void setName(string);
    void setDate(Date);
    void setScore(int);
    string getName();
    Date getDate();
    int getScore();
    void print();
};

#endif
