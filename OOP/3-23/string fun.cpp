#include <iostream>
#include <sstream>
#include <string>
using namespace std;
void printStringArray(string word[], int size)
{
    for (int i = 0; i < 10; i++)
    {
        cout << word[i] << endl;
    }
    cout << "Length:" << size << endl;
}
int main()
{
    int size;
    string txt, word[10];
    getline(cin, txt);
    stringstream ss(txt);
    int i = 0;
    while (ss >> word[i] && !ss.eof())
    {
        i++;
    }
    size = txt.length();
    printStringArray(word, size);
}