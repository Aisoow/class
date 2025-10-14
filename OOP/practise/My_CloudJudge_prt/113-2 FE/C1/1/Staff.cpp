#include "Staff.h"
int Staff::time = 0;
Staff::Staff(/* args */) {}
Staff::Staff(string name, Birthday br, Salary sa)
{
    this->name = name;
    this->br = br;
    this->sa = sa;
    time++;
}
void Staff::setName(string name)
{
    this->name = name;
}
string Staff::getName() const
{
    return name;
}
void Staff::setBr(Birthday br)
{
    this->br = br;
}
Birthday Staff::getBr() const
{
    return br;
}
void Staff::setSa(Salary sa)
{
    this->sa = sa;
}
Salary Staff::getSa() const
{
    return sa;
}
int Staff::getTime() const
{
    return time;
}
void Staff::print()
{
    cout << name << " ";
    br.print();
    sa.print();
    cout << endl;
}