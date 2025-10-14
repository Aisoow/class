#ifndef Student_h
#define Student_h
#include "Course.h"
#include <iostream>
#include <cstring>
#include <fstream>
#include <iomanip>
using namespace std;
class Student
{
private:
    char name[30];
    char ID[30];
    Course course;
    static int numOfStu;

public:
    Student();
    Student(string, string, Course);
    void setName(string);
    string getName() const;
    void setID(string);
    string getID() const;
    void setCourse(Course);
    Course getCourse() const;
    int getNumOfStu() const;
    void printStudent();
};
#endif
