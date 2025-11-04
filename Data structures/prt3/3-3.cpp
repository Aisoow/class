#include <stdio.h>
#include <iostream>
using namespace std;
class Stack
{
private:
    /* data */
public:
    Stack();
    int capacity;
    int *array;

    int top;
    void Push(int x);
    void Pop();
};
Stack::Stack()
{
    capacity = 100;
    top = -1;
    array = new int[capacity];
}
void Stack::Push(int x)
{
    top++;
    array[top] = x;
}
void Stack::Pop()
{
    array[top] = ' ';
    top--;
}

int Transfer(char postfix[])
{
    Stack s;
    int i = 0;
    while (postfix[i] != '\0')
    {
        if (postfix[i] >= '0' && postfix[i] <= '9')
        {
            s.Push(postfix[i] - '0');
        }
        else
        {
            int b = s.array[s.top];
            s.Pop();
            int a = s.array[s.top];
            s.Pop();

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
                result = a / b;
                break;
            }
            s.Push(result);
        }
        i++;
    }
    return s.array[s.top];
}

int main(int argc, char *argv[])
{
    char itemset[20];
    scanf("%s", itemset);
    int result = Transfer(itemset);
    cout << result << endl;
}