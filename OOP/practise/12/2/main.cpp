#include "stack.h"
#include <iostream>
using namespace std;
int main()
{
    Stack<char> stack;

    for (int i = 0; i < 9; i++)
    {
        char c;
        cin >> c;
        stack.push(c);
    }
    while (stack.getSize() >= 3)
    {
        char op1 = stack.pop();
        char op = stack.pop();
        char op2 = stack.pop();

        int result = 0;
        if (op == '+')
        {
            result = op2 - '0' + op1 - '0';
        }
        else if (op == '-')
        {
            result = op2 - '0' - (op1 - '0');
        }
        else if (op == '*')
        {
            result = (op2 - '0') * (op1 - '0');
        }
        else if (op == '/')
        {
            result = (op2 - '0') / (op1 - '0');
        }
        stack.push(result + '0');

        cout << result << endl;
    }
}