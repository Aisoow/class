#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

/**
 * 解析字串中的整數
 * 功能：從以逗號分隔的字串中提取所有整數
 *
 * @param str 輸入字串（格式：num1,num2,num3,...）
 * @return 包含所有解析出整數的向量
 *
 * 範例：
 * 輸入："23,4,56"
 * 輸出：[23, 4, 56]
 */
vector<int> parseInts(string str)
{
    vector<int> result;   // 儲存解析結果的向量
    stringstream ss(str); // 將字串轉換為字串串流（方便解析）
    char c;               // 暫存分隔符（逗號）
    int num;              // 暫存讀取的整數

    // 持續讀取整數，直到字串串流結束
    while (ss >> num)
    {
        result.push_back(num); // 將整數加入結果向量
        ss >> c;               // 讀取並跳過分隔符（逗號）
    }

    return result; // 返回解析後的整數向量
}

/**
 * 主函式
 * 功能：讀取逗號分隔的整數字串，解析並逐行輸出每個整數
 */
int main(int argc, char *argv[])
{
    string str; // 儲存輸入字串
    cin >> str; // 讀取輸入（格式：num1,num2,num3,...）

    // 呼叫 parseInts 函式解析字串
    vector<int> integers = parseInts(str);

    // 逐行輸出每個整數
    for (int i = 0; i < integers.size(); i++)
    {
        cout << integers[i] << "\n";
    }

    return 0;
}