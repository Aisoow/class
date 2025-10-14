#include "Student.h"
#include "Date.h"
#include <iostream>
using namespace std;
Student::Student(string n, Date d, int s) : name(n), birthDay(d), score(s) {}
void Student::setName(string n)
{
    name = n;
}
void Student::setDate(Date d)
{
    birthDay = d;
}
void Student::setScore(int s)
{
    score = s;
}
string Student::getName()
{
    return name;
}
Date Student::getDate()
{
    return birthDay;
}
int Student::getScore()
{
    return score;
}
void Student::print()
{
    cout << name;
    birthDay.print();
    cout << " " << score << endl;
}