#include "Person.h"
Person::Person() {}
Person::Person(string name, string type) : name(name), type(type) {}
string Person::getName()
{
    return name;
}
string Person::getType()
{
    return type;
}
void Person::print()
{
    cout << name << " " << type << endl;
}