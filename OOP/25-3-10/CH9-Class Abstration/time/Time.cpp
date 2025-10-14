
#include <iostream>
#include <iomanip>
#include "Time.h" // include definition of class Time from Time.h
using namespace std;

// Time constructor initializes each data member 
Time::Time(int hour, int minute, int second)
{
	setTime(hour, minute, second); // validate and set time
} // end Time constructor

// set new Time value using universal time
void Time::setTime(int h, int m, int s)
{
	setHour(h); // set private field hour
	setMinute(m); // set private field minute
	setSecond(s); // set private field second
} // end function setTime

// set hour value
void Time::setHour(int h)
{
	if (h >= 0 && h < 24)
		hour = h;
	else
		hour = 0;
} // end function setHour

// set minute value
void Time::setMinute(int m)
{
	if (m >= 0 && m < 60)
		minute = m;
	else
		minute = 0;
} // end function setMinute

// set second value
void Time::setSecond(int s)
{
	if (s >= 0 && s < 60)
		second =  s;
	else
		second = 0;
} // end function setSecond

// return hour value
int Time::getHour()
{
	return hour;
} // end function getHour

// return minute value
int Time::getMinute()
{
	return minute;
} // end function getMinute

// return second value
int Time::getSecond()
{
	return second;
} // end function getSecond

// print Time in universal-time format (HH:MM:SS)
void Time::print()
{
	cout << setfill('0') << setw(2) << getHour() << ":"
		<< setw(2) << getMinute() << ":" << setw(2) << getSecond();
} // end function printUniversal
