#include "Teacher.h"
void printTeacher(Teacher teacher[], int size)
{
    fstream bin("Teacher.bin", ios::in & ios::binary);
    for (int i = 0; i < size; i++)
    {
        bin.read(reinterpret_cast<char *>(&teacher[i]), sizeof(Teacher));
        teacher[i].print();
    }
    bin.close();
}
int main()
{
    Teacher teacher[4];

    fstream bin("Teacher.bin", ios::out & ios::binary);
    for (int i = 0; i < 4; i++)
    {
        string name;
        int age;
        double score;
        cin >> name >> age >> score;
        teacher[i] = {name, age, score};
        bin.write(reinterpret_cast<char *>(&teacher[i]), sizeof(Teacher));
    }
    bin.close();
    printTeacher(teacher, 4);
}