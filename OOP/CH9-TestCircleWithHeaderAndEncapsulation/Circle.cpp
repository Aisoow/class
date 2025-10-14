#include "circle.h"

// 建構子實作
Circle::Circle() {
    radius = 1;
}

Circle::Circle(double newRadius) {
    radius = newRadius;
}

// **Getter：取得半徑**
double Circle::getRadius()  {
    return radius;
}

// **Setter：設定半徑**
void Circle::setRadius(double newRadius) {
    if (newRadius >= 0) { // 確保半徑不能為負數
        radius = newRadius;
    }
}

// **計算圓面積**
double Circle::getArea()  {
    return radius * radius * 3.14159;
}