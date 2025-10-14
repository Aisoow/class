#include<iostream>
using namespace std;
int main()
{
	int ih, im;
	int oh, om;
	int th=0, tm=0;
	int m=0;
	cin >> ih >> im >> oh >> om;
	tm = om + 60 - im;
	ih++;
	th = oh - ih;
	tm += th * 60;
	if (tm >= 30)
	{
		while (tm > 150)//檢查時間是否有超過120分鐘
		{
			tm -= 30;
			m += 50;
		}
		while (tm > 90)
		{
			tm -= 30;
			m += 30;
		}
		m += (tm / 30) * 20;
	}
	cout << m << endl;
	return 0;
}