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
    void BackEnqueue(int x);
    void Dequeue();
    void BackDequeue();
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
void Queue::BackEnqueue(int x)
{
    arr[front] = x;
    front = (front - 1 + 10) % 10;
}
void Queue::Dequeue()
{
    front = (front + 1) % 10;
}
void Queue::BackDequeue()
{
    rear = (rear - 1 + 10) % 10;
}
void Queue::PrintQueue()
{
    for (int i = (front + 1) % 10; i != rear; i = (i + 1) % 10)
    {
        cout << arr[i] << " ";
    }
    /*
    int i = front;
    while (i != rear)
    {
        i = (i + 1) % 10;
        cout << arr[i] << " ";
    }
    */
    cout << " rear:" << rear << " front:" << front;
}
int main(int argc, char *argv[])
{
    Queue queue;
    int times, input;
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
    cin >> times;
    for (int j = 0; j < times; j++)
    {
        cin >> input;
        queue.BackEnqueue(input);
    }
    cin >> times;
    for (int j = 0; j < times; j++)
    {
        queue.BackDequeue();
    }
    queue.PrintQueue();
}