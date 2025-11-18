#include <iostream>
using namespace std;
class Queue
{
private:
    /* data */
public:
    int arr[10];
    int rear = -1;
    int front = -1;
    Queue(/* args */);
    void Enqueue(int x);
    void Dequeue();
    void PrintQueue();
};

Queue::Queue(/* args */)
{
}
void Queue::Enqueue(int x)
{
    arr[++rear] = x;
}
void Queue::Dequeue()
{
    arr[++front] = ' ';
}
void Queue::PrintQueue()
{
    for (int i = front + 1; i <= rear; i++)
    {
        cout << arr[i] << " ";
    }
}

int main(int argc, char *argv[])
{
    Queue queue;
    int times, input;
    cin >> times;
    for (int i = 0; i < times; i++)
    {
        cin >> input;
        queue.Enqueue(input);
    }
    cin >> times;
    for (int i = 0; i < times; i++)
    {
        queue.Dequeue();
    }
    queue.PrintQueue();
}