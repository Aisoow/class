#include "Book.h"
#include "Person.h"
int main()
{
    Person p[10];
    string pn, pt;
    Book b[50];
    string bn, bt, bs;
    double pr;
    for (int i = 0; i < 10; i++)
    {
        cin >> pn >> pt;
        p[i] = Person(pn, pt);
    }
    for (int i = 0; i < 50; i++)
    {
        cin >> bn >> bt >> bs >> pr;
        b[i] = Book(bn, bt, bs, pr);
    }
    for (int i = 0; i < 10; i++)
    {
        p[i].print();
        for (int j = 0; j < 50; j++)
        {
            if (p[i].getType() == b[j].getType())
            {
                b[j].print();
            }
        }
        cout << "----------" << endl;
    }
}