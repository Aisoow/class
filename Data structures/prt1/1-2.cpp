#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

int main(int argc, char *argv[])
{
    int n;
    cin >> n;
    vector<int> score(n);
    for (int i = 0; i < n; i++)
    {
        cin >> score[i];
    }
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += score[i];
    }
    sum /= n;
    if (sum >= 60)
    {
        cout << "及格" << endl;
    }
    else
    {
        cout << "不及格" << endl;
    }
    return 0;
}