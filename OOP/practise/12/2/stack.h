#ifndef STACK_H
#define STACK_H

template <typename T>
class Stack
{
public:
    Stack();
    Stack(const Stack &);
    ~Stack();
    bool empty() const;
    int peek() const;
    void push(int value);
    int pop();
    int getSize() const;

private:
    int *elements;
    int size;
    int capacity;
    void ensureCapacity();
};
template <typename T>
Stack<T>::Stack() : size(0), capacity(16)
{
    elements = new int[capacity];
}
template <typename T>
Stack<T>::Stack(const Stack &stack)
{
    elements = new int[stack.capacity];
    size = stack.size;
    capacity = stack.capacity;
    for (int i = 0; i < size; i++)
    {
        elements[i] = stack.elements[i];
    }
}
template <typename T>
Stack<T>::~Stack()
{
    delete[] elements;
}
template <typename T>
bool Stack<T>::empty() const
{
    return (size == 0);
}
template <typename T>
int Stack<T>::peek() const
{
    return elements[size - 1];
}
template <typename T>
void Stack<T>::push(int value)
{
    ensureCapacity();
    elements[size++] = value;
}
template <typename T>
void Stack<T>::ensureCapacity()
{
    if (size >= capacity)
    {
        int *old = elements;
        capacity = 2 * size;
        elements = new int[size * 2];

        for (int i = 0; i < size; i++)
            elements[i] = old[i];

        delete[] old;
    }
}
template <typename T>
int Stack<T>::pop()
{
    return elements[--size];
}
template <typename T>
int Stack<T>::getSize() const
{
    return size;
}

#endif