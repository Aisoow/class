#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int score[20][5];
    for (int student = 0; student < 20; student++)
    {
        for (int sub = 0; sub < 5; sub++)
        {
            cin >> score[student][sub];
        }
    }
    return 0;
}
