#include <iostream>
using namespace std;

template <class T>
void sort(T stu[], int y)
{
    for (int i = 0; i < y - 1; i++)
        for (int j = i + 1; j < y; j++)
            if (stu[i] > stu[j])
                swap(stu[i], stu[j]);
}

int main()
{
    int class_num;
    cin >> class_num;
    int *mid = new int[class_num];
    for (int i = 0; i < class_num; i++)
    {
        int num_stu;
        cin >> num_stu;
        int *stu = new int[num_stu];
        for (int j = 0; j < num_stu; j++)
        {
            cin >> stu[j];
        }
        sort(stu, num_stu);
        if (num_stu % 2 == 0)
        {
            mid[i] = (stu[num_stu / 2 - 1] + stu[num_stu / 2]) / 2.0;
        }
        else
        {
            mid[i] = stu[(num_stu / 2)];
        }
    }
    sort(mid, class_num);

    if (class_num % 2 == 0)
    {
        cout << static_cast<double>((mid[class_num / 2 - 1] + mid[(class_num / 2)]) / 2) << endl;
    }
    else
    {
        cout << static_cast<double>(mid[(class_num / 2)]) << endl;
    }
    return 0;
}