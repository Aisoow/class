#include <iostream>
#include "Score.h"
#include <string>
using namespace std;
int main()
{
    string n;
    int m;
    Score s1, s2;
    s1.setMath(90);
    s1.setName("John");
    s2.setMath(80);
    s2.setName("Mary");
    cin >> n >> m;
    s1.setName(n);
    s2.setMath(m);
    s1.print();
    s2.print();
}