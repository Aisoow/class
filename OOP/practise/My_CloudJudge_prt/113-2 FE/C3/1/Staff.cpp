#include "Staff.h"
Staff::Staff(/* args */) {}
Staff::Staff(string name, Birthday br, Salary sa) : name(name), br(br), sa(sa) {}
void Staff::setName(string name)
{
    this->name = name;
}
string Staff::getName()
{
    return name;
}
void Staff::setBr(Birthday br)
{
    this->br = br;
}
Birthday Staff::getBr()
{
    return br;
}
void Staff::setSa(Salary sa)
{
    this->sa = sa;
}
Salary Staff::getSa()
{
    return sa;
}
void Staff::print(ostream &o)
{
    o << name << " ";
    br.print(o);
    sa.print(o);
    o << endl;
}