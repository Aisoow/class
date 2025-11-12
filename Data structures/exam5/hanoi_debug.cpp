#include <iostream>
#include <vector>
#include <cmath>
#include <string>
using namespace std;

vector<vector<int>> getPasswordTable(int number)
{
    srand(number);
    vector<vector<int>> PasswordTable(10, vector<int>(10));
    for (int i = 0; i < 10; ++i)
    {
        for (int j = 0; j < 10; ++j)
        {
            PasswordTable[i][j] = rand() % 100;
        }
    }

    return PasswordTable;
}

vector<int> getCipertext(int HTCode, vector<vector<int>> PasswordTable)
{
    vector<int> result;
    vector<int> indices;

    // 將編號轉換為字串以便處理
    string codeStr = to_string(HTCode);
    cout << "HTCode: " << HTCode << endl;
    cout << "CodeStr: " << codeStr << endl;

    // 從尾開始，兩兩一組
    int len = codeStr.length();
    for (int i = len - 1; i >= 0; i -= 2)
    {
        int row, col;

        if (i == 0)
        {
            // 只剩一位數，補0
            col = codeStr[i] - '0';
            row = 0;
        }
        else
        {
            // 兩位數配對
            col = codeStr[i] - '0';
            row = codeStr[i - 1] - '0';
        }

        cout << "Index: [" << row << "][" << col << "] = " << PasswordTable[row][col] << endl;
        // 取得密碼表的內容
        result.push_back(PasswordTable[row][col]);
    }

    return result;
}

void HanoiTowerCode(int n, int &k, int &total)
{
    if (n == 1)
    {
        total += k;
        k++;
        return;
    }

    // 將 n-1 個盤子從起始柱移到輔助柱
    HanoiTowerCode(n - 1, k, total);

    // 移動第 n 個盤子
    total += k;
    k++;

    // 將 n-1 個盤子從輔助柱移到目標柱
    HanoiTowerCode(n - 1, k, total);
}

int main()
{
    int Plaintext, k = 4, total = 0;
    cin >> Plaintext;

    // 將該數字層數+2的河內塔進行搬移
    int n = Plaintext + 2;
    cout << "n = " << n << endl;

    HanoiTowerCode(n, k, total);
    cout << "Total: " << total << endl;

    vector<vector<int>> PasswordTable = getPasswordTable(total);

    vector<int> ans = getCipertext(total, PasswordTable);
    cout << "Result: ";
    for (int i = 0; i < ans.size(); ++i)
    {
        cout << ans[i];
    }
    cout << endl;
}
