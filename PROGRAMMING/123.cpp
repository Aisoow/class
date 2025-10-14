#include <iostream>
#include <ctime>
#include <cstdlib>
#include <thread>
#include <chrono>
#include <conio.h> // For non-blocking input on Windows

using namespace std;

const int TOTAL_MOLES = 25; // Total number of moles in the game

void displayGrid(int gridSize, int moleX, int moleY)
{
    for (int i = 0; i < gridSize; ++i)
    {
        for (int j = 0; j < gridSize; ++j)
        {
            if (i == moleX && j == moleY)
            {
                cout << "[M] ";
            }
            else
            {
                cout << "[ ] ";
            }
        }
        cout << endl;
    }
    cout << endl;
}

void gameIntroduction()
{
    cout << "歡迎來到打地鼠遊戲！\n";
    cout << "規則說明：\n";
    cout << "1. 地圖為 N x N 大小，每回合會隨機出現一隻地鼠。\n";
    cout << "2. 輸入地鼠所在的行與列（1 起始），例如：1 2 表示第一行第二列。\n";
    cout << "3. 打中地鼠得 4 分，遊戲總共有 25 隻地鼠，滿分為 100 分。\n";
    cout << "4. 若在時間內未輸入，則視為地鼠跑掉，直接進入下一回合。\n\n";
}

int selectDifficulty()
{
    int difficulty;
    cout << "請選擇難度：\n";
    cout << "1. 簡單（地鼠出現速度較慢）\n";
    cout << "2. 普通（地鼠出現速度適中）\n";
    cout << "3. 困難（地鼠出現速度較快）\n";
    cout << "9. 極限（地鼠出現速度極快）\n";
    cout << "請輸入難度（1-3 或 9）：";
    cin >> difficulty;

    while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 9)
    {
        cout << "無效的選擇，請重新輸入（1-3 或 9）：";
        cin >> difficulty;
    }
    return difficulty;
}

int selectGridSize()
{
    int gridSize;
    cout << "請輸入想挑戰的地圖大小（N x N，N 為整數，例如 3 表示 3 x 3）：";
    cout << "（輸入 123 可重新選擇難度）\n";
    cin >> gridSize;

    while ((gridSize < 2 || gridSize > 10) && gridSize != 123)
    {
        cout << "無效的選擇，請輸入 2 到 10 之間的整數或輸入 123 重新選擇難度：";
        cin >> gridSize;
    }
    return gridSize;
}

int main()
{
    while (true)
    {
        gameIntroduction();

        // Select difficulty
        int difficulty = selectDifficulty();
        int delay;
        switch (difficulty)
        {
        case 1:
            delay = 4500; // Easy
            break;
        case 2:
            delay = 3000; // Normal
            break;
        case 3:
            delay = 1000; // Hard
            break;
        case 9:
            delay = 200; // Extreme
            break;
        }

        int gridSize;
        while (true)
        {
            gridSize = selectGridSize();
            if (gridSize == 123)
            {
                difficulty = selectDifficulty();
                switch (difficulty)
                {
                case 1:
                    delay = 4500; // Easy
                    break;
                case 2:
                    delay = 3000; // Normal
                    break;
                case 3:
                    delay = 1000; // Hard
                    break;
                case 9:
                    delay = 200; // Extreme
                    break;
                }
            }
            else
            {
                break;
            }
        }

        cout << "遊戲將在 5 秒後開始！準備好囉！\n";
        this_thread::sleep_for(chrono::seconds(5));

        int score = 0;
        int moleCount = 0;

        while (moleCount < TOTAL_MOLES)
        {
            // Randomly generate mole position
            int moleX = rand() % gridSize;
            int moleY = rand() % gridSize;

            // Display the grid
            cout << "--- 打地鼠遊戲 ---\n";
            displayGrid(gridSize, moleX, moleY);

            // Get player input with strict timeout
            int playerX = -1, playerY = -1;
            auto start = chrono::high_resolution_clock::now();
            bool inputReceived = false;

            cout << "請輸入行（1-" << gridSize << "）：";
            while (chrono::duration_cast<chrono::milliseconds>(chrono::high_resolution_clock::now() - start).count() < delay)
            {
                if (_kbhit())
                {
                    cin >> playerX;
                    inputReceived = true;
                    break;
                }
            }

            if (inputReceived)
            {
                auto currentTime = chrono::high_resolution_clock::now();
                if (chrono::duration_cast<chrono::milliseconds>(currentTime - start).count() < delay)
                {
                    cout << "請輸入列（1-" << gridSize << "）：";
                    while (chrono::duration_cast<chrono::milliseconds>(currentTime - start).count() < delay)
                    {
                        if (_kbhit())
                        {
                            cin >> playerY;
                            break;
                        }
                    }
                }
                else
                {
                    cout << "\n地鼠跑了！時間用完。\n";
                    this_thread::sleep_for(chrono::seconds(1));
                    ++moleCount;
                    continue;
                }
            }
            else
            {
                cout << "\n地鼠跑了！時間用完。\n";
                this_thread::sleep_for(chrono::seconds(1));
                ++moleCount;
                continue;
            }

            // Convert input to 0-based indexing
            playerX--;
            playerY--;

            // Check if the input is correct
            if (playerX == moleX && playerY == moleY)
            {
                cout << "\n恭喜！成功打中地鼠！\n";
                score += 4;
            }
            else
            {
                cout << "\n失手了！沒打中地鼠。\n";
            }
            this_thread::sleep_for(chrono::seconds(1));

            ++moleCount;

            // Clear the screen (platform-dependent)
#ifdef _WIN32
            system("cls");
#else
            system("clear");
#endif
        }

        // Display final score
        cout << "\n所有地鼠都出現過了！\n";
        cout << "你的最終得分是：" << score << " 分（滿分 100 分）\n";
        cout << "選擇的難度是：";
        switch (difficulty)
        {
        case 1:
            cout << "簡單\n";
            break;
        case 2:
            cout << "普通\n";
            break;
        case 3:
            cout << "困難\n";
            break;
        case 9:
            cout << "極限\n";
            break;
        }

        // Ask to play again
        char playAgain;
        cout << "再來一局？(Y/N)：";
        cin >> playAgain;
        if (playAgain != 'Y' && playAgain != 'y')
        {
            cout << "感謝遊玩，再見！\n";
            break;
        }
    }

    return 0;
}