#include <stdio.h>
#include <iostream>
using namespace std;

int Priority(char op)
{
    if (op == '+' || op == '-')
        return 1;
    else if (op == '*' || op == '/')
        return 2;
    else if (op == '^')
        return 3;
    else if (op == '(')
        return 0;
    return -1;
}

class Stack
{
private:
    /* data */
public:
    Stack();
    int capacity;
    char *array;

    int top;
    void Push(char x);
    void Pop();
};
Stack::Stack()
{
    capacity = 100;
    top = -1;
    array = new char[capacity];
}
void Stack::Push(char x)
{
    top++;
    array[top] = x;
}
void Stack::Pop()
{
    array[top] = ' ';
    top--;
}

void InfixToPostfix(char infix[])
{
    Stack S;
    int i = 0;
    while (infix[i] != '\0')
    {
        if ((infix[i] >= '0' && infix[i] <= '9') || (infix[i] >= 'a' && infix[i] <= 'z') || (infix[i] >= 'A' && infix[i] <= 'Z'))
        {
            printf("%c", infix[i]);
        }
        else
        {
            if (infix[i] == '(')
            {
                S.Push('(');
            }
            else if (infix[i] == ')')
            {
                while (S.top >= 0 && S.array[S.top] != '(')
                {
                    printf("%c", S.array[S.top]);
                    S.Pop();
                }
                S.Pop();
            }
            else
            {
                while (S.top != -1 && Priority(infix[i]) <= Priority(S.array[S.top]))
                {
                    printf("%c", S.array[S.top]);
                    S.Pop();
                }
                S.Push(infix[i]);
            }
        }
        i++;
    }
    while (S.top != -1)
    {
        printf("%c", S.array[S.top]);
        S.Pop();
    }
}

int main(int argc, char *argv[])
{
    char itemset[20];
    scanf("%s", itemset);
    InfixToPostfix(itemset);
    printf("\n");
    return 0;
}