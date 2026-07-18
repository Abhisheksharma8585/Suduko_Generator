# Sudoku Generator (Java)

## 📌 Overview

The **Sudoku Generator** is a Java application that generates a valid **9 × 9 Sudoku board** using the **Backtracking Algorithm**. The numbers are placed randomly while ensuring that every row, column, and 3 × 3 subgrid satisfies Sudoku rules.

This project demonstrates recursion, backtracking, randomization, and object-oriented programming concepts in Java.

---

## ✨ Features

* Generates a valid 9 × 9 Sudoku board.
* Uses randomized number placement.
* Implements the Backtracking algorithm.
* Verifies Sudoku constraints before placing numbers.
* Displays the board in a formatted grid.
* Beginner-friendly and easy to understand.

---

## 🛠 Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Backtracking Algorithm
* Recursion
* Collections Framework

---

## 📂 Project Structure

```
Sudoku_Generator/
│
├── README.md
├── .gitignore
└── Sudoku Game/
    │
    ├── src/
        └── SudokuGenerator.java

```

---

## 📚 Libraries Used

```java
import java.util.ArrayList;
import java.util.Collections;
```

---

## ⚙️ How It Works

1. Create an empty 9 × 9 Sudoku board.
2. Visit each cell recursively.
3. Shuffle the numbers 1–9 to ensure randomness.
4. Check whether a number can be safely placed.
5. If valid, place the number and continue.
6. If no valid number exists, backtrack and try another.
7. Continue until the board is completely filled.

---

## ▶️ How to Run

### Compile

```bash
javac SudokuGenerator.java
```

### Execute

```bash
java SudokuGenerator
```

---

## 🧩 Sample Output

```text
-------------------------------------
| 3 | 7 | 2 | 5 | 1 | 6 | 4 | 8 | 9 |
-------------------------------------
| 8 | 6 | 9 | 3 | 2 | 4 | 5 | 7 | 1 |
-------------------------------------
| 5 | 1 | 4 | 7 | 8 | 9 | 3 | 2 | 6 |
-------------------------------------
| 4 | 3 | 6 | 8 | 5 | 1 | 7 | 9 | 2 |
-------------------------------------
| 1 | 9 | 7 | 4 | 3 | 2 | 6 | 5 | 8 |
-------------------------------------
| 2 | 5 | 8 | 6 | 9 | 7 | 1 | 3 | 4 |
-------------------------------------
| 7 | 2 | 3 | 1 | 6 | 8 | 9 | 4 | 5 |
-------------------------------------
| 9 | 4 | 1 | 2 | 7 | 5 | 8 | 6 | 3 |
-------------------------------------
| 6 | 8 | 5 | 9 | 4 | 3 | 2 | 1 | 7 |
-------------------------------------
```

---

## 🧠 Algorithm

The application uses the **Backtracking Algorithm**.

* Try a random number from **1–9**.
* Check whether the number is valid for the current cell.
* If valid, move to the next cell.
* If no valid number exists, backtrack to the previous cell and try another value.
* Repeat until all cells are filled.

---

## 📈 Time Complexity

* Worst Case: **O(9^(81))**
* Space Complexity: **O(81)** (due to recursion stack)

Although the theoretical worst case is large, backtracking with constraint checking makes generation practical.

---

## 🚀 Future Improvements

* Generate playable Sudoku puzzles.
* Support Easy, Medium, Hard, and Expert difficulty levels.
* Guarantee a unique solution.
* Add a Sudoku solver.
* Create a Java Swing or JavaFX graphical interface.
* Add timer, hints, and score tracking.
* Export puzzles to PDF or image format.

---

## 👨‍💻 Author

**Abhishek Sharma**

B.Tech – Computer Science Engineering
Sagar Institute of Research and Technology (SIRT), Bhopal

---
