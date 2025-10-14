#include "Course.h"
Course::Course() {}
Course::Course(int math, int english, int computer) : math(math), english(english), computer(computer) {}
void Course::setMath(int math)
{
    this->math = math;
}
void Course::setEnglish(int english)
{
    this->english = english;
}
void Course::setComputer(int computer)
{
    this->computer = computer;
}
int Course::getMath() const
{
    return math;
}
int Course::getEnglish() const
{
    return english;
}
int Course::getComputer() const
{
    return computer;
}
int Course::getSum() const
{
    return math + english + computer;
}
double Course::getAverage() const
{
    return Course::getSum() / 3.0;
}
void Course::printScore()
{
    cout << fixed << setprecision(1)
         << math << " " << english << " " << computer
         << " Sum:" << Course::getSum()
         << " Average:" << Course::getAverage();
}