#include <iostream>
using namespace std;

// 判斷是否為同花 (Flush)
bool isFlush(const int sArr[])
{
    for (int i = 0; i < 4; i++)
    { // 遍歷四種花色 (黑桃、紅心、方塊、梅花)
        if (sArr[i] == 5)
            return true; // 如果某個花色的牌數是 5，表示全部同花色
    }
    return false; // 沒有任何花色出現 5 次，不是同花
}

// 判斷是否為順子 (Straight)
bool isStraight(const int pArr[])
{
    for (int i = 0; i < 10; i++)
    {
        // 從 0 到 9 遍歷起始點，因為順子最多由 10 開始 (10-J-Q-K-A)
        if (pArr[i] == 1 && pArr[i + 1] == 1 && pArr[i + 2] == 1 && pArr[i + 3] == 1 && pArr[(i + 4) % 13] == 1)
            return true; // 五張連續點數 (特別處理 A 連接情況)
    }
    return false; // 沒有連續五張點數，則不是順子
}

// 判斷是否為同花順 (Straight Flush)
bool isStraightFlush(const int pArr[], const int sArr[])
{
    if (isStraight(pArr))
    { // 首先檢查是否是順子
        if (isFlush(sArr))
        {                // 如果是順子，再檢查是否是同花
            return true; // 順子且同花，為同花順
        }
        else
            return false; // 不是同花，即非同花順
    }
    return false; // 不是順子，自然不是同花順
}

// 判斷是否為三條 (Three of a Kind)
bool isThreeOfAKind(const int pFArr[])
{
    if (pFArr[3] == 1 && pFArr[2] == 0)
        return true; // 存在 3 張相同點數，且沒有其他點數有兩張
    else
        return false; // 其他情況下，不是三條
}

// 判斷是否為四條 (Four of a Kind)
bool isFourOfAKind(const int pFArr[])
{
    if (pFArr[4] == 1)
        return true; // 存在 4 張相同點數，即為四條
    else
        return false; // 其他情況下，不是四條
}

// 判斷是否為葫蘆 (Full House)
bool isFullHouse(const int pFArr[])
{
    if (pFArr[3] == 1 && pFArr[2] == 1)
        return true; // 存在 3 張相同點數，且存在 2 張相同點數
    else
        return false; // 其他情況下，不是葫蘆
}

// 判斷是否為兩對 (Two Pair)
bool isTwoPair(const int pFArr[])
{
    if (pFArr[2] == 2)
        return true; // 存在兩對不同點數的牌 (各出現 2 次)
    else
        return false; // 其他情況下，不是兩對
}

// 判斷是否為一對 (One Pair)
bool isOnePair(const int pFArr[])
{
    if (pFArr[1] == 3 && pFArr[2] == 1)
        return true; // 存在 1 對，且其他 3 張牌分別是不同點數
    else
        return false; // 其他情況下，不是一對
}

// 計算玩家的撲克牌得分
int pokerPoint(int cards[])
{
    int point[13] = {0}; // 點數計數陣列 (0~12 對應 A~K)
    int suit[4] = {0};   // 花色計數陣列 (0~3 對應黑桃、紅心、方塊、梅花)

    // 遍歷所有手牌，統計每張牌的點數和花色
    for (int i = 0; i < 5; i++)
    {
        // 遍歷每位玩家的 5 張牌 (因為每位玩家只分配固定 5 張牌)
        point[cards[i] % 13]++; // 計算該牌的點數 (0~12)，並累加計數
        suit[cards[i] / 13]++;  // 計算該牌的花色 (0~3)，並累加計數
    }

    int pFreq[5] = {0}; // 點數頻率計數陣列 (pFreq[x] 表示點數出現 x 次的數量)
    for (int i = 0; i < 13; i++)
    {
        // 遍歷 13 個點數 (0~12)，統計每種出現次數的點數有多少個
        pFreq[point[i]]++;
    }

    // 根據撲克牌規則判斷牌型並返回對應分數
    if (isStraightFlush(point, suit))
        return 7; // 同花順
    else if (isFourOfAKind(pFreq))
        return 6; // 四條
    else if (isFullHouse(pFreq))
        return 5; // 葫蘆
    else if (isStraight(point))
        return 4; // 順子
    else if (isThreeOfAKind(pFreq))
        return 3; // 三條
    else if (isTwoPair(pFreq))
        return 2; // 兩對
    else if (isOnePair(pFreq))
        return 1; // 一對
    else
        return 0; // 雜牌
}

int main()
{
    const int CRADSPERHAND = 5; // 每位玩家手上固定持有 5 張牌

    int players;    // 玩家數量
    cin >> players; // 輸入玩家數量

    // 遍歷每位玩家
    for (int player = 0; player < players; player++)
    {
        // 遍歷次數等於玩家數量，確保處理每位玩家的手牌
        int cards[CRADSPERHAND] = {0}; // 當前玩家的手牌

        // 輸入當前玩家的 5 張牌
        for (int i = 0; i < CRADSPERHAND; i++)
        {
            // 固定 5 張牌，輸入每張牌的編號 (0~51)
            cin >> cards[i];
        }

        // 輸出當前玩家的撲克牌分數
        cout << pokerPoint(cards) << endl;
    }
}