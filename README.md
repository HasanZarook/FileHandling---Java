
# 📁 File Handling in Java - Persons Management

This Java project demonstrates **file handling**, **serialization**, and **deserialization** to manage a list of persons. You can add new persons, save them to a file, and load them back for display.  

---

## 📝 Classes Overview

### 1. `Persons`
- Stores person details: **name**, **registration number**, and **contact number**.
- Maintains a list of all persons.
- Supports:
  - Adding persons
  - Saving to a file (`Person.txt`)
  - Loading from a file
  - Displaying all persons

### 2. `file_handle`
- Main class for interacting with the user.
- Provides a menu:
  1. Add persons  
  2. Display persons  
  3. Exit  

---

## 🚀 How to Run
1. Clone or download the repository.
2. Compile the program:
```bash
javac file_handle.java
````

3. Run the program:

```bash
java file_handle
```

4. Follow the menu instructions to add or display persons.

---

## ⚡ Example Interaction

```
1.Add Persons 
2.Display persons
3.Exit
Enter choice: 1
how many persons do u want to add: 2
Enter Name: Hasan
Enter Registration number: REG123
Enter the contact number: 0712345678
Enter Name: Ayesha
Enter Registration number: REG124
Enter the contact number: 0723456789
```

---

## 🛠 Concepts Demonstrated

* **Serialization & Deserialization** (`ObjectOutputStream` & `ObjectInputStream`)
* **File Handling** (writing and reading objects from a file)
* **Dynamic List Management** (`ArrayList`)
* **Menu-driven console application**

---

## 📜 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code.

---

