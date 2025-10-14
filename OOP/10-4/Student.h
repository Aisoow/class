#ifndef STUDENT_H
#define STUDENT_H
#include "Date.h"
#include <iostream>
using namespace std;
class Student
{
private:
    string name;
    Date birthDay;
    int score;

public:
    Student();
    Student(string, Date, int);
    void setName(string), setDate(Date), setScore(int);
    void print();
    string getName();
    Date getDate();
    int getScore();
};

#endif