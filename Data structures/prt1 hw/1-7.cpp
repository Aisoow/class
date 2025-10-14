#include <iostream>
#include <string>
#include <vector>
using namespace std;

/**
 * 解決方案類別：用於檢測人類基因組
 */
class Solution
{
public:
    /**
     * 檢測符合人類基因組的 DNA 序列數量
     *
     * @param allowed 允許的字元集合（人類基因組的有效字元）
     * @param datas DNA 序列資料的向量
     * @return 符合人類基因組條件的序列數量
     */
    int detectHumanGenome(string allowed, vector<string> &datas)
    {
        int count = 0; // 計數器：記錄符合條件的序列數量

        // 遍歷每一個 DNA 序列
        for (string data : datas)
        {
            bool is_human = 1; // 假設該序列是人類基因組

            // 檢查序列中的每一個字元
            for (char c : data)
            {
                // 如果字元不在允許的字元集合中
                if (allowed.find(c) == string::npos) // string::npos 表示未找到
                {
                    is_human = 0; // 標記為非人類基因組
                    break;        // 立即跳出內層迴圈
                }
            }

            // 如果該序列通過所有檢查，計數器加一
            if (is_human)
            {
                count++;
            }
        }
        return count; // 返回符合條件的總數
    }
};

/**
 * 主函式
 */
int main(int argc, char const *argv[])
{
    string allowed, data; // allowed: 允許的字元集，data: 暫存的 DNA 序列
    vector<string> datas; // 儲存所有 DNA 序列的向量
    int num, ans = 0;     // num: 序列數量，ans: 答案

    // 輸入：允許的字元集和序列數量
    cin >> allowed >> num;

    // 讀取所有 DNA 序列
    for (int i = 0; i < num; i++)
    {
        cin >> data;
        datas.push_back(data); // 將序列加入向量
    }

    // 創建解決方案物件並計算結果
    Solution sol;
    ans = sol.detectHumanGenome(allowed, datas);

    // 輸出符合條件的序列數量
    cout << ans;

    return 0;
}