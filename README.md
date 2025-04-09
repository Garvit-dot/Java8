# Student Management System (Java)

This is a **menu-driven Java application** for managing student records. The project demonstrates the usage of:

- **Classes and Objects**
- **ArrayList (Array of Objects)**
- **Constructors**
- **Instance Members**
- **Custom Exceptions**
- **Modular Programming (Multi-file Java Project)**


## 👨‍🎓 Student Class Attributes

- `prn`: Unique ID for the student
- `name`: Full name of the student
- `dob`: Date of Birth (as string format `dd-mm-yyyy`)
- `marks`: Student's marks (as `double`)

---

## 🧠 Features / Operations

Each operation is implemented in a separate method with proper exception handling:

| Operation         | Description                                       | Exceptions Used                             |
|------------------|---------------------------------------------------|---------------------------------------------|
| Add Student       | Add new student to the list                      | `DuplicatePRNException`, `InvalidInputException` |
| Display Students  | Show all student records                         | `EmptyStudentListException`                 |
| Search by PRN     | Find student using PRN                           | `StudentNotFoundException`                  |
| Search by Name    | Find student using name                          | `StudentNotFoundException`                  |
| Search by Position| Access student by index                          | `InvalidInputException`                     |
| Update Student    | Edit existing student details                    | `StudentNotFoundException`                  |
| Delete Student    | Remove student from list                         | `StudentNotFoundException`                  |

---

## Notes
Uses ArrayList internally to manage dynamic list of students.

Exceptions are thrown for robust error handling.

Code is modularized for easy readability and extensibility.


## Topics Demonstrated
Java OOP Concepts

ArrayList & Collections

Exception Handling (Custom Exceptions)

Menu-driven console interface

Modular Java programming
