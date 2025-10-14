#ifndef CIRCLE_H
#define CIRCLE_H

class Circle {
private:
    double radius;  // **將 radius 設為 private，避免外部直接存取**

public:
    // Constructors
    Circle();
    Circle(double newRadius);

    // Getters and Setters
    double getRadius() ;  // 取得半徑
    void setRadius(double newRadius); // 設定半徑

    // Member function
    double getArea() ;
};

#endif
