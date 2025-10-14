#include "Book.h"
Book::Book() {}
Book::Book(string name, string type, string serial_number, double price)
{
    this->name = name;
    this->type = type;
    this->serial_number = serial_number;
    this->price = price;
}
string Book::getType()
{
    return type;
}
double Book::getPrice()
{
    return price;
}
void Book::print()
{
    cout << name << " " << type << " " << serial_number << " " << price << endl;
}