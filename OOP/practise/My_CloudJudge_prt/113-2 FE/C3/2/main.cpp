#include "Student.h"
#include <vector>
void printAve(vector<Student> s, int size)
{
    double ma = 0, ea = 0, ca = 0;
    for (int i = 0; i < size; i++)
    {
        ma += s[i].getCourse().getMath();
        ea += s[i].getCourse().getEnglish();
        ca += s[i].getCourse().getComputer();
    }
    cout << fixed << setprecision(1)
         << "mathAverage:" << ma / size << endl
         << "englishAverage:" << ea / size << endl
         << "computerAverage:" << ca / size << endl;
}
int main()
{
    int n;
    cin >> n;
    vector<Student> s(n);
    vector<Course> c(n);
    fstream bin("s.bin", ios::out | ios::binary);
    for (int i = 0; i < n; i++)
    {
        string name, ID;
        int math, english, computer;
        cin >> name >> ID >> math >> english >> computer;
        c[i] = {math, english, computer};
        s[i] = {name, ID, c[i]};
        bin.write(reinterpret_cast<char *>(&s[i]), sizeof(Student));
    }
    bin.close();

    vector<Student> news(n);
    fstream ib("s.bin", ios::in | ios::binary);
    for (int i = 0; i < n; i++)
    {
        ib.read(reinterpret_cast<char *>(&news[i]), sizeof(Student));
        news[i].printStudent();
    }
    printAve(news, n);
}