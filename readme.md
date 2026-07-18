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
SudokuGenerator/
│
├── SudokuGenerator.java
└── README.md
```

---

## 📚 Libraries Used

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
+-------+-------+-------+
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
+-------+-------+-------+
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
+-------+-------+-------+
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
+-------+-------+-------+
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
