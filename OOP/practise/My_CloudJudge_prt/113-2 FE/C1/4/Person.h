#ifndef Person_h
#define Person_h
#include <iostream>
using namespace std;
class Person
{
private:
    string name;
    string type;

public:
    Person();
    Person(string, string);
    string getName();
    string getType();
    void print();
};
#endif