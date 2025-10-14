#include <iostream>
using namespace std;

void print(int a, int b, int c)
{
    cout << a << "," << b << "," << c << endl;
}
void swap(int *ptr1, int *ptr2)
{
    int temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}
int main()
{
    int a, b, c;
    cin >> a >> b >> c;
    int *aptr = &a, *bptr = &b, *cptr = &c;
    print(a, b, c);
    swap(aptr, bptr);
    print(a, b, c);
    swap(aptr, cptr);
    print(a, b, c);
}