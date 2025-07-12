# JavaProblems

This repository contains solutions to two Java programming problems related to **price calculations** and **refunds** based on item IDs and quantities. The problems involve the use of arrays, conditional statements, and basic loops to compute total price and refund values.

---

## 🧩 Problem 1 - Calculate Total Price

**File**: `Problem1/Solution1.java`

### 📝 Description:

Given:
- A list of item IDs
- Their respective prices
- Quantities sold

If an item ID is **5004 or 5005**, a **20% discount** is applied to its unit price.

The program:
- Calculates the total cost of all items
- Applies discounts where required
- Outputs the final amount

### 🔢 Sample Data:
```java
itemId    = {5001, 5002, 5003, 5004, 5005}
prices    = {100, 200, 150, 300, 50}
quantities= {3, 1, 4, 5, 6}
```

---

## 🧩 Problem 2 - Calculate Total Refund

**File**: `Problem2/Solution2.java`

### 📝 Description:

Given:
- A list of item IDs
- Their respective prices
- Quantities returned by the user (entered via `Scanner`)

If an item ID is **5004 or 5005**, a **20% deduction** is applied to the refund amount.

The program:
- Takes user input for the returned quantity of each item
- Calculates refund per item
- Outputs the total refund amount

### 🔢 Sample Data:
```java
itemId    = {5001, 5002, 5003, 5004, 5005}
prices    = {100, 200, 150, 300, 50}
```

> Note: The program expects user input for returned quantities.

---

## 💻 How to Run

1. Make sure you have Java installed.
2. Open a terminal inside the folder.
3. Compile and run using:
```bash
javac Problem1/Solution1.java
java Problem1.Solution1

javac Problem2/Solution2.java
java Problem2.Solution2
```

---

## 📌 Notes

- These are simple introductory problems designed to strengthen your logic building and Java fundamentals.
- The logic handles discounts and user inputs effectively using basic control structures.

---

## 👨‍💻 Author

**Sarajwanth**  
📚 Electronics and Communication Engineering Student  
🎯 Aspiring VLSI Engineer
