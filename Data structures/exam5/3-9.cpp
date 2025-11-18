#include <stdio.h>
#include <iostream>
using namespace std;
int Priority(char op)
{
    if (op == '+' || op == '-')
    {
        return 1;
    }
    else if (op == '*' || op == '/')
    {
        return 2;
    }
    else
    {
        return 0;
    }
}
void InfixToPrefix(char infix[])
{
    char stk[20] = {0}, result[20] = {0};
    int top = 0, n = 0;

    // 找到字串長度
    int len = 0;
    while (infix[len] != '\0')
        len++;

    // 從右到左掃描（反向掃描中序表達式）
    for (int i = len - 1; i >= 0; i--)
    {
        char ch = infix[i];

        // 如果是數字，直接加入結果
        if (ch >= '0' && ch <= '9')
        {
            result[n++] = ch;
        }
        // 如果是右括號 ')'，推入堆疊
        else if (ch == ')')
        {
            stk[top++] = ch;
        }
        // 如果是左括號 '('，彈出直到遇到 ')'
        else if (ch == '(')
        {
            while (top > 0 && stk[top - 1] != ')')
            {
                result[n++] = stk[--top];
            }
            if (top > 0)
                top--; // 移除 ')'
        }
        // 如果是運算子
        else
        {
            // 注意：前序轉換時，優先順序判斷使用 <= 而非 <
            while (top > 0 && Priority(ch) <= Priority(stk[top - 1]) && stk[top - 1] != ')')
            {
                result[n++] = stk[--top];
            }
            stk[top++] = ch;
        }
    }

    // 彈出剩餘的運算子
    while (top > 0)
    {
        result[n++] = stk[--top];
    }

    // 反轉結果得到前序表達式
    for (int i = n - 1; i >= 0; i--)
    {
        cout << result[i];
    }
}
int main(int argc, char *argv[])
{
    char itemset[20];
    scanf("%s", itemset);
    /*
    for (int i = 0; itemset[i] != '\0'; i++)
    {
        cout << itemset[i];
    }
    cout << endl;
    */
    InfixToPrefix(itemset);
}