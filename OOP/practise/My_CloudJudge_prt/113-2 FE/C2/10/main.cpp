#include <iostream>
#include <vector>
using namespace std;
template <typename T>
vector<vector<T>> vectorMultiply(vector<T> v1, vector<T> v2)
{
    vector<vector<T>> result;
    for (int i = 0; i < 5; i++)
    {
        vector<T> row;
        for (int j = 0; j < 5; j++)
        {
            row.push_back(v1[i] * v2[j]);
        }
        result.push_back(row);
    }
    return result;
}
template <typename T>
void print(vector<vector<T>> &v)
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cout << v[i][j] << " ";
        }
        cout << endl;
    }
}
int main()
{
    vector<int> i1(5);
    vector<int> i2(5);
    for (int i = 0; i < 5; i++)
    {
        cin >> i1[i];
    }
    for (int i = 0; i < 5; i++)
    {
        cin >> i2[i];
    }
    vector<vector<int>> ir = vectorMultiply(i1, i2);
    print(ir);

    vector<double> d1(5);
    vector<double> d2(5);
    for (int i = 0; i < 5; i++)
    {
        cin >> d1[i];
    }
    for (int i = 0; i < 5; i++)
    {
        cin >> d2[i];
    }
    vector<vector<double>> dr = vectorMultiply(d1, d2);
    print(dr);
}
