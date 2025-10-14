#include "Teacher.h"
Teacher::Teacher() : name(""), age(0), score(0) {}
Teacher::Teacher(string name, int age, double score) : age(age), score(score)
{
    strcpy(this->name, name.c_str());
}
void Teacher::setName(string name)
{
    strcpy(this->name, name.c_str());
}
void Teacher::setAge(int age)
{
    this->age = age;
}
void Teacher::setScore(double score)
{
    this->score = score;
}
string Teacher::getName()
{
    return string(name);
}
int Teacher::getAge()
{
    return age;
}
double Teacher::getScore()
{
    return score;
}
void Teacher::print()
{
    cout << "Name:" << name << " Age:" << age
         << fixed << setprecision(1)
         << " Score:" << score << endl;
}