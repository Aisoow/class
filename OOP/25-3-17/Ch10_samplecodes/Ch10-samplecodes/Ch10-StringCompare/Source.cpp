#include <iostream>
#include <string>

using namespace std;

int main() {
    string s1("Welcome"); 
    string s2("Welcomg");

    cout << s1.compare(s2) << endl; // 預期 -1
    cout << s2.compare(s1) << endl; // 預期 1
    cout << s1.compare("Welcome") << endl; // 預期 0


    string s3("Welcome to HTML");
    cout << s3.find("co") << endl; // returns 3
    cout << s3.find("co", 6) << endl; // returns -1
    cout << s3.find('o') << endl; // returns 4
    cout << s3.find('o', 6) << endl; // returns 9


    return 0;
}
