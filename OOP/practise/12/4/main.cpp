#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;
void stuAve(vector<vector<double>> score)
{
    for (int i = 0; i < 5; i++)
    {
        double sum = 0;
        for (int j = 0; j < 3; j++)
        {
            sum += score[i][j];
            cout << fixed << setprecision(1) << score[i][j] << ", ";
        }
        cout << fixed << setprecision(1) << sum / 3 << endl;
    }
}
double *courseAve(vector<vector<double>> score)
{
    static double avg[3] = {};
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            avg[i] += score[j][i];
        }
        avg[i] /= 5;
    }
    return avg;
}
int main()
{
    vector<vector<double>> score = {
        {80.0, 70.0, 90.0},
        {85.0, 77.0, 95.0},
        {83.0, 75.0, 70.0},
        {73.0, 95.0, 67.0},
        {88.0, 79.0, 71.0}};
    stuAve(score);
    double *avg = courseAve(score);
    cout << "Average: ";
    for (int i = 0; i < 3; i++)
    {
        cout << fixed << setprecision(1) << avg[i];
        if (i != 2)
        {
            cout << ",";
        }
    }
    system("pause");
    return 0;
}