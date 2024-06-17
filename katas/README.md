# Summer Internship Katas

## Introduction

After the warm-up, we collected some experience working with Kotlin and applying tests during development.
We now turn to Katas: small projects meant for regular deliberate practice.

**Goals**: 

- Get experience solving Katas
- Apply object-orientation where needed
- Pick a Kata that you want to do every day
- Observe how your solution changes after a few days
- Write your own tests for the Kata

## Katas

### Bank OCR Scanner

Write a scanner for bank OCR codes.
Such codes consist of 4 lines where each line contains of 27 characters.

Example:
```
  _  _     _  _  _  _  _ 
| _| _||_||_ |_   ||_||_|
||_  _|  | _||_|  ||_| _|
```

Your scanner should output 123456789 for this example.

The original Kata proceeds to add more functionality to scanner.
We focus first on the basic form of the Kata.
Feel free to look up the original Kata.

File: [src/main/kotlin/kata/bankocr/BankOcrReader.kt](src/main/kotlin/kata/bankocr/BankOcrReader.kt)

Tests: [src/test/kotlin/kata/bankocr/BankOcrReaderTest.kt](src/test/kotlin/kata/bankocr/BankOcrReaderTest.kt)

### Employee Report

You're building an employee management system of a local grocery store.
The shop-owner wants to open the shop on Sunday and due to legal restrictions employees younger than 18 years are not allowed to work Sundays.
The employee asks for a reporting feature so she can schedule work shifts. All employees are already stored somewhere and have the following properties:

- name: string (the name of the employee)
- age: number (the age in years of the employee)

Implement the following user stories in order.
Furthermore, you have to write at least one test for each user story.

1. As shop owner I want to view a list of all employees who are 18 years or older so that I know who is allowed to work on Sundays.
2. As shop owner I want the list of employees to be sorted by their name, so I can find employees easier.
3. As shop owner I want the list of employees to be capitalized, so I can read it better.
4. As shop owner I want the employees to be sorted by their names descending instead of ascending. 

File: [src/main/kotlin/kata/employeereport/EmployeeReport.kt](src/main/kotlin/kata/employeereport/EmployeeReport.kt)

Tests: [src/test/kotlin/kata/employeereport/EmployeeReportTest.kt](src/test/kotlin/kata/employeereport/EmployeeReportTest.kt)

### Langton's Ant 

Write a simulator for the [Langton's Ant](https://en.wikipedia.org/wiki/Langton%27s_ant]).

Squares on a plane are colored variously either black or white. We arbitrarily identify one square as the "ant". The ant can travel in any of the four cardinal directions at each step it takes. The "ant" moves according to the rules below:

1. At a white square, turn 90° clockwise, flip the color of the square, move forward one unit
2. At a black square, turn 90° counter-clockwise, flip the color of the square, move forward one unit

**Note:** This Kata has no stub implementation.

File: [src/main/kotlin/kata/langtonant/AntSimulator.kt)](src/main/kotlin/kata/langtonant/AntSimulator.kt)

Tests: [src/test/kotlin/kata/langtonant/AntSimulatorTest.kt](src/test/kotlin/kata/langtonant/AntSimulatorTest.kt)
