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
}
int Transfer(char postfix[])
{
    int number[20] = {};
    int top = -1, ansNum;

    for (int i = 0; postfix[i] != '\0'; i++)
    {

        switch (postfix[i])
        {
        case '+':
            ansNum = number[top - 1] + number[top];
            top -= 2;
            break;
        case '-':
            ansNum = number[top - 1] - number[top];
            top -= 2;
            break;
        case '*':
            ansNum = number[top - 1] * number[top];
            top -= 2;
            break;
        case '/':
            ansNum = number[top - 1] / number[top];
            top -= 2;
            break;
        default:
            ansNum = postfix[i] - '0';
        }

        number[++top] = ansNum;
    }
    return number[0];
}
void InfixToPostfix(char infix[], char Postfix[])
{
    char symbol_temp[10] = {};
    int symbol_top = -1, postfix_top = -1;

    for (int current_infix = 0; infix[current_infix] != '\0'; current_infix++)
    {
        switch (infix[current_infix])
        {
        case '(':
            symbol_temp[++symbol_top] = infix[current_infix];
            break; // case '(':

        case '+':
        case '-':
        case '*':
        case '/':
            while (Priority(infix[current_infix]) <= Priority(symbol_temp[symbol_top]))
            {
                Postfix[++postfix_top] = symbol_temp[symbol_top--];
            }
            symbol_temp[++symbol_top] = infix[current_infix];
            break; // case '+': case '-': case '*': case '/':

        case ')':
            while (symbol_temp[symbol_top] != '(')
                Postfix[++postfix_top] = symbol_temp[symbol_top--];
            symbol_top--;
            break; //  case ')':

        default:
            Postfix[++postfix_top] = infix[current_infix];
        }

    } // while end

    while (symbol_temp[symbol_top])
    {
        Postfix[++postfix_top] = symbol_temp[symbol_top--];
    }
}
int Eval(char infix[])
{
    char postfix[100];
    InfixToPostfix(infix, postfix);
    return Transfer(postfix);
}
main(int argc, char *argv[])
{
    char itemset[20];
    scanf("%s", itemset);
    int result = Eval(itemset);
    cout << result << endl;
}