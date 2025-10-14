#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

vector<int> parseInts(string str)
{
    vector<int> result;
    char c;
    stringstream ss(str);
    int num;
    while (ss >> num)
    {
        result.push_back(num);
        ss >> c;
    }
    return result;
}

int main(int argc, char *argv[])
{
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for (int i = 0; i < integers.size(); i++)
    {
        cout << integers[i] << "\n";
    }

    return 0;
}