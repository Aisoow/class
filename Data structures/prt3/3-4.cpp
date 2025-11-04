#include <stdio.h>
#include <iostream>
#include <string.h>
using namespace std;

class Stack
{
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
    if (top >= 0)
        top--;
}

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

// 中序轉後序
void InfixToPostfix(char infix[], char postfix[])
{
    Stack s;
    int i = 0, j = 0;

    while (infix[i] != '\0')
    {
        if (infix[i] >= '0' && infix[i] <= '9')
        {
            postfix[j++] = infix[i];
        }
        else if (infix[i] == '(')
        {
            s.Push('(');
        }
        else if (infix[i] == ')')
        {
            while (s.top >= 0 && s.array[s.top] != '(')
            {
                postfix[j++] = s.array[s.top];
                s.Pop();
            }
            s.Pop();
        }
        else
        {
            while (s.top != -1 && Priority(infix[i]) <= Priority(s.array[s.top]))
            {
                postfix[j++] = s.array[s.top];
                s.Pop();
            }
            s.Push(infix[i]);
        }
        i++;
    }

    while (s.top != -1)
    {
        postfix[j++] = s.array[s.top];
        s.Pop();
    }

    postfix[j] = '\0';
}

int Transfer(char postfix[])
{
    int stack[100];
    int top = -1;
    int i = 0;

    while (postfix[i] != '\0')
    {
        if (postfix[i] >= '0' && postfix[i] <= '9')
        {
            stack[++top] = postfix[i] - '0';
        }
        else
        {
            int b = stack[top--];
            int a = stack[top--];

            int result = 0;

            switch (postfix[i])
            {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                break;
            }
            stack[++top] = result;
        }
        i++;
    }
    return stack[top];
}

int Eval(char infix[])
{
    char postfix[100];
    InfixToPostfix(infix, postfix);
    return Transfer(postfix);
}
int main(int argc, char *argv[])
{
    char itemset[20];
    scanf("%s", itemset);

    int result = Eval(itemset);
    cout << result << endl;

    return 0;
}