#include<iostream>
using namespace std;
int main()
{
    string t;
    int day = 0;
    int od=0, oh, om, os;
    int pd=0, ph, pm, ps;
    int md=0, mh, mm, ms;
    cin >> oh >> om >> os;//輸入原始的時間
    cin >> ph >> pm >> ps;//輸入加上的時間
    cin >> mh >> mm >> ms;//輸入減去的時間

    os += ps;               //計算原始時間加上待加時間
    while (os >= 60)
    {
        os -= 60;
        om++;
    }
    om += pm;
    while (om >= 60)
    {
        om -= 60;
        oh++;
    }
    oh += ph;
    while (oh >= 24)
    {
        oh -= 24;
        od++;
    }
    if (od != day)//偵測是否有換日
    {
        t = "Yes";
        day = od;
    }
    else
    {
        t = "No";
    }
    cout << "#1" << endl << "Next day: " << t << endl;//輸出是否有換日
    cout << day << " Day," << oh << " Hour " << om << " Min " << os << " Sec" << endl;//輸出日期與時間
         
    os -= ms;           //計算原始時間減掉待減時間
    while (os < 0)
    {
        om--;
        os += 60;
    }
    om -= mm;
    while (om < 0)
    {
        oh--;
        om += 60;
    }
    oh -= mh;
    while (oh < 0)
    {
        od--;
        oh += 24;
    }
    if(od != day)//偵測是否有換日
    {
        t = "Yes";
        day = od;
    }
    else
    {
        t = "No";
    }
    cout << "#2" << endl << "Next day: " << t << endl;//輸出是否有換日
    cout << day << " Day," << oh << " Hour " << om << " Min " << os << " Sec" << endl;//輸出日期與時間
}