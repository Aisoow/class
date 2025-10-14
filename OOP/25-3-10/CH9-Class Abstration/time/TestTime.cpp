#include <iostream>
#include "Time.h" // include definition of class Time from Time.h
using namespace std;

int main()
{
	Time t1; // all arguments defaulted
	Time t2(2); // hour specified; minute and second defaulted
	Time t3(21, 34); // hour and minute specified; second defaulted 
	Time t4(12, 25, 42); // hour, minute and second specified

	cout << "Constructed with:\n\nt1: all arguments defaulted\n  ";
	t1.print(); // 00:00:00
	cout << "\n\nt2: hour specified; minute and second defaulted\n  ";
	t2.print(); // 02:00:00
	cout << "\n\nt3: hour and minute specified; second defaulted\n  ";
	t3.print(); // 21:34:00
	cout << "\n\nt4: hour, minute and second specified\n  ";
	t4.print(); // 12:25:42
	system("pause");
} // end main
