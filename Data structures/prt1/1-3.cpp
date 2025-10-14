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
    int max = score[0];
    int min = score[0];
    for (int i = 0; i < n; i++)
    {
        if (score[i] > max)
        {
            max = score[i];
        }
        if (score[i] < min)
        {
            min = score[i];
        }
    }
    cout << max << " " << min;
    return 0;
}