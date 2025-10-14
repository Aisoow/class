#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution
{
public:
    int detectHumanGenome(string allowed, vector<string> &datas)
    {
        int count = 0;
        for (string data : datas)
        {
            bool is_human = 1;
            for (char c : data)
            {
                if (allowed.find(c) == -1)
                {
                    is_human = false;
                    break;
                }
            }
            if (is_human)
                count++;
        }
        return count;
    }
};

int main(int argc, char const *argv[])
{
    string allowed, data;
    vector<string> datas;
    int num, ans = 0;
    cin >> allowed >> num;

    for (int i = 0; i < num; i++)
    {
        cin >> data;
        datas.push_back(data);
    }

    Solution sol;
    ans = sol.detectHumanGenome(allowed, datas);
    cout << ans;

    return 0;
}