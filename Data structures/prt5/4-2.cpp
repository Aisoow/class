#include <iostream>
using namespace std;
class Queue
{
private:
    /* data */
public:
    int arr[10];
    int rear = 0;
    int front = 0;
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
    rear = (rear + 1) % 10;
    arr[rear] = x;
}
void Queue::Dequeue()
{
    front = (front + 1) % 10;
}
void Queue::PrintQueue()
{
    int i = front;
    while (i != rear)
    {
        i = (i + 1) % 10;
        cout << arr[i] << " ";
    }
    cout << " rear:" << rear << " front:" << front;
}

int main(int argc, char *argv[])
{
    Queue queue;
    int times, input;
    for (int i = 0; i < 2; i++)
    {
        cin >> times;
        for (int j = 0; j < times; j++)
        {
            cin >> input;
            queue.Enqueue(input);
        }
        cin >> times;
        for (int j = 0; j < times; j++)
        {
            queue.Dequeue();
        }
    }
    queue.PrintQueue();
}