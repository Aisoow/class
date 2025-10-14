#include "Student.h"
int Student::numOfStu = 0;
Student::Student() {}
Student::Student(string name, string ID, Course course) : course(course)
{
    strcpy(this->name, name.c_str());
    strcpy(this->ID, ID.c_str());
}
void Student::setName(string name)
{
    strcpy(this->name, name.c_str());
}
string Student::getName() const
{
    return name;
}
void Student::setID(string ID)
{
    strcpy(this->ID, ID.c_str());
}
string Student::getID() const
{
    return ID;
}
void Student::setCourse(Course course)
{
    this->course = course;
}
Course Student::getCourse() const
{
    return course;
}
void Student::printStudent()
{
    cout << fixed << setprecision(1)
         << name << " "
         << ID << " ";
    course.printScore();
    cout << endl;
}