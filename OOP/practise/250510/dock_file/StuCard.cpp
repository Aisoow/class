#include "StuCard.h"
#include <iostream>
using namespace std;
StuCard::StuCard(string name, bool sex, double *score) : name(name), sex(sex)
{
    for (int i = 0; i < 3; i++)
    {
        scoreAry[i] = score[i];
    }
}
void StuCard::setName(string name)
{
    this->name = name;
}
void StuCard::setSex(bool sex)
{
    this->sex = sex;
}
void StuCard::setScore(int size, double *scoreAry)
{
    for (int i = 0; i < size; i++)
    {
        this->scoreAry[i] = scoreAry[i];
    }
}
string StuCard::getName()
{
    return name;
}
bool StuCard::getSex()
{
    return sex;
}
double StuCard::getScore(int size)
{
    return scoreAry[size];
}