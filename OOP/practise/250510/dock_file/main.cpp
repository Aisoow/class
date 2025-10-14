#include "StuCard.h"
#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
using namespace std;
int main()
{
    double scoreAry[5][3] = {
        {80.0, 70.0, 90.0},
        {85.0, 77.0, 95.0},
        {83.0, 75.0, 70.0},
        {73.0, 95.0, 67.0},
        {88.0, 79.0, 71.0}};
    StuCard stuCard[5] = {
        StuCard("Jerry", 1, scoreAry[0]),
        StuCard("John", 1, scoreAry[1]),
        StuCard("Mary", 0, scoreAry[2]),
        StuCard("Tom", 1, scoreAry[3]),
        StuCard("Claire", 0, scoreAry[4])};
    ofstream outfile("StuCard.txt");
    for (int i = 0; i < 5; i++)
    {
        outfile << fixed << setprecision(1) << stuCard[i].getName() << " "
                << stuCard[i].getSex()
                << " " << stuCard[i].getScore(0)
                << " " << stuCard[i].getScore(1)
                << " " << stuCard[i].getScore(2)
                << endl;
    }
    outfile.close();
    ifstream infile("StuCard.txt");
    string str;
    while (getline(infile, str))
    {
        cout << str << endl;
    }
    infile.close();
}
