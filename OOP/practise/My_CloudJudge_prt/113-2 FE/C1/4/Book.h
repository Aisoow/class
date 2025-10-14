#ifndef Book_h
#define Book_h
#include <iostream>
using namespace std;
class Book
{
private:
    string name;
    string type;
    string serial_number;
    double price;

public:
    Book();
    Book(string, string, string, double);
    string getType();
    double getPrice();
    void print();
};
#endif