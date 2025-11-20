#include <iostream>
using namespace std;
class Queue
{
public:
    int arr[10] = {};
    int rear = 0;
    int front = 0;
    Queue() {};
    void Enqueue(int x)
    {   
        if(rear==10)
            rear = 0;
        arr[rear++] = x;
    }
    void Dequeue()
    {
        front = (front + 1) % 10;
    }
    void BackEnqueue(int x){
        if(front==0)
            front = 10;
        arr[--front] = x;
    }

    void PrintQueue()
    {
        for (int i = front; i < rear; i++)
            cout << arr[i]<<" ";
        cout << "rear:" << rear << " front:" << front;
    }
    void BackDequeue(){
        rear = rear - 1;
        if(rear<0)
            rear += 10;
    }
};
int main(int argc, char* argv[]) {
    Queue queue;
    int times, input;
    cin >> times;
    for (int j = 0; j < times; j++) {
        cin >> input;
        queue.Enqueue(input);
    }
    cin >> times;
    for (int j = 0; j < times; j++) {
        queue.Dequeue();
    }
    cin >> times;
    for (int j = 0; j < times; j++) {
        cin >> input;
        queue.BackEnqueue(input);
    }
    cin >> times;
    for (int j = 0; j < times; j++) {
        queue.BackDequeue();
    }
    queue.PrintQueue();
}