以下是針對您下周一 C++ OOP 考試的詳細教學與學習企劃，涵蓋您提到的五個主題。每個主題包含簡單的概念解釋、範例程式碼以及學習計劃。

---

### **學習企劃**
- **週六**：學習 `swap by reference` 和 `Template`，並完成相關練習。
- **週日**：學習 `Vector`（包括 2D Vector）和 `stack`，並完成相關練習。
- **週一早上**：複習 `read & write file`，並進行模擬測試。

---

### **1. Swap by Reference**
#### **概念**
`swap by reference` 是利用 C++ 的參考（reference）來交換兩個變數的值，避免使用指標或額外的記憶體。

#### **範例程式碼**
```cpp
#include <iostream>
using namespace std;

void swapByReference(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int x = 10, y = 20;
    cout << "Before swap: x = " << x << ", y = " << y << endl;
    swapByReference(x, y);
    cout << "After swap: x = " << x << ", y = " << y << endl;
    return 0;
}
```

#### **學習計劃**
1. 理解參考的概念。
2. 練習撰寫 `swapByReference` 函式，並嘗試交換不同型別的變數。

---

### **2. Template**
#### **概念**
Template 是 C++ 的泛型編程工具，允許撰寫與型別無關的程式碼。

#### **範例程式碼**
```cpp
#include <iostream>
using namespace std;

template <typename T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << "Int addition: " << add(3, 5) << endl;
    cout << "Double addition: " << add(2.5, 3.7) << endl;
    return 0;
}
```

#### **學習計劃**
1. 學習 `template` 的語法。
2. 撰寫範例程式碼，嘗試建立多個 `template` 函式和類別。

---

### **3. Vector（包括 2D Vector）**
#### **概念**
`std::vector` 是 C++ 標準模板庫（STL）中的動態陣列，支援自動調整大小。2D Vector 是向量的向量，模擬矩陣結構。

#### **範例程式碼**
```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {
    // 1D Vector
    vector<int> vec = {1, 2, 3, 4};
    vec.push_back(5);
    for (int val : vec) {
        cout << val << " ";
    }
    cout << endl;

    // 2D Vector
    vector<vector<int>> vec2D = {{1, 2}, {3, 4}, {5, 6}};
    for (const auto &row : vec2D) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }
    return 0;
}
```

#### **學習計劃**
1. 學習 `vector` 的基本操作（新增、刪除、遍歷）。
2. 練習建立和操作 2D Vector。

---

### **4. Stack**
#### **概念**
`std::stack` 是 C++ STL 中的容器，遵循後進先出（LIFO）的原則。

#### **範例程式碼**
```cpp
#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    s.push(10);
    s.push(20);
    s.push(30);

    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    return 0;
}
```

#### **學習計劃**
1. 學習 `stack` 的基本操作（`push`、`pop`、`top`）。
2. 撰寫範例程式碼，模擬簡單的堆疊應用。

---

### **5. Read & Write File (`<fstream>`)**
#### **概念**
`<fstream>` 提供檔案的讀寫功能，包括 `ifstream`（讀取）和 `ofstream`（寫入）。

#### **範例程式碼**
```cpp
#include <iostream>
#include <fstream>
using namespace std;

int main() {
    // Write to a file
    ofstream outFile("example.txt");
    outFile << "Hello, file!" << endl;
    outFile.close();

    // Read from a file
    ifstream inFile("example.txt");
    string line;
    while (getline(inFile, line)) {
        cout << line << endl;
    }
    inFile.close();

    return 0;
}
```

#### **學習計劃**
1. 學習檔案的基本操作（開啟、讀取、寫入、關閉）。
2. 撰寫程式碼，嘗試讀寫不同格式的檔案。

---

### **總結**
1. **週六**：完成 `swap by reference` 和 `Template` 的學習與練習。
2. **週日**：完成 `Vector` 和 `stack` 的學習與練習。
3. **週一早上**：複習 `read & write file`，並進行模擬測試。

祝您考試順利！如果需要進一步的幫助，隨時告訴我！

找到 1 種授權類型的類似代碼