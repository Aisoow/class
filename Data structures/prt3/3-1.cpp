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
    void PrintStack();
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
    array[top] = -1;
    top--;
}
void Stack::PrintStack()
{
    for (int i = top; i >= 0; i--)
    {
        cout << array[i];
    }
}
int main(int argc, char *argv[])
{
    Stack stack;
    int times, input;
    cin >> times;
    for (int i = 0; i < times; i++)
    {
        cin >> input;
        stack.Push(input);
    }
    cin >> times;
    for (int i = 0; i < times; i++)
    {
        stack.Pop();
    }
    stack.PrintStack();
}