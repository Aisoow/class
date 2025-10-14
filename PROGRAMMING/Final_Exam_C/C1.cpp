#include <iostream>
#include <string>
using namespace std;

void print(char *chr, int start, int print_size)
{
    for (int i = 0; i < start; i++)
    {
        chr++;
    }
    for (int i = 0; i < print_size; i++)
    {
        cout << *chr;
        chr++;
    }
}

int main()
{
    char s[200];
    cin >> s;
    char *chr = s;
    int start, print_size;
    cin >> start >> print_size;
    print(chr, start, print_size);
    return 0;
}