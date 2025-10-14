#ifndef CIRCLE_H
#define CIRCLE_H

class Circle
{
private:
    double radius; // **�N radius �]�� private�A�קK�~�������s��**

public:
    // Constructors
    Circle();
    Circle(double newRadius);

    // Getters and Setters
    double getRadius();               // ���o�b�|
    void setRadius(double newRadius); // �]�w�b�|

    // Member function
    double getArea();
};

#endif
