#include "Staff.h"
/* 注意事項
 * 不要刪除 main() 裡頭任何 code
 * 測資是固定的，請不要鑽漏洞，我們都會知道
 */

int main()
{
    fstream io;
    io.open("a.txt", ios::out);
    io << "Eden 2002 3 2 10 20\n";
    io << "Asuna 1995 5 4 8 30\n";
    io << "Alice 2000 10 10 9 12";
    io.close();

    Staff s[3];
    ifstream inf("a.txt");
    for (int i = 0; i < 3; i++)
    {
        string name;
        int year, month, day;
        int hours, workDay;
        inf >> name >> year >> month >> day >> hours >> workDay;
        s[i] = {name, Birthday(year, month, day), Salary(hours, workDay)};
    }

    for (int i = 0; i < 3; ++i)
        s[i].print(cout);
}