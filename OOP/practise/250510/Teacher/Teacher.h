#ifndef TEATCHER_H
#define TEATCHER_H
#include <iomanip>
#include <iostream>
#include <cstring>
#include <fstream>
#include <string>
using namespace std;
class Teacher
{
private:
    char name[30];
    int age;
    double score;

public:
    Teacher();
    Teacher(string, int, double);
    void setName(string);
    void setAge(int);
    void setScore(double);
    string getName();
    int getAge();
    double getScore();
    void print();
};
#endif