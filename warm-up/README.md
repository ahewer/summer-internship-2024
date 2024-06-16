# Summer Internship Warm-Up

## Introduction

Let's get familiar with the Kotlin programming language by working on software-engineering related tasks.

Please have a look at https://kotlinlang.org/docs/kotlin-tour-welcome.html for an introduction to Kotlin.

**Note**: Your solutions to the exercises do not need to be perfect. 
We have other goals for the warm-up:

- Learn some basics of Kotlin
- Get familiar with IntelliJ
- Learn the basics of Test-Driven-Design
- Get a feeling for software development that is oriented around tasks

## Exercises

Each exercise comes with a stub-implementation file and associated tests.
Feel free to add additional tests if it helps your development process.

### 1. Unique Characters

Implement an algorithm for determining if a UTF8 string consists of unique characters.
This means that no characters should occur more than once.

File: [src/main/kotlin/exercise/UniqueCharacters.kt](./src/main/kotlin/exercise/UniqueCharacters.kt)

Tests: [src/test/kotlin/exercise/UniqueCharactersTest.kt](./src/test/kotlin/exercise/UniqueCharactersTest.kt)

### 2. Permutation Checker

Given two strings, determine if the one string is a permutation of the other.

File: [src/main/kotlin/exercise/PermutationChecker.kt](./src/main/kotlin/exercise/PermutationChecker.kt)

Tests: [src/test/kotlin/exercise/PermutationCheckerTest.kt](./src/test/kotlin/exercise/PermutationCheckerTest.kt)

### 3. Simple URL encoder

Write a simple URL encoder that 

1. Trims trailing whitespace
2. Replaces whitespace with %20

File: [src/main/kotlin/exercise/UrlEncoder.kt](./src/main/kotlin/exercise/UrlEncoder.kt)

Tests: [src/test/kotlin/exercise/UrlEncoderTest.kt](./src/test/kotlin/exercise/UrlEncoderTest.kt)

### 4. Palindrome Permutation Checker

Write an algorithm that checks if a given string is a permutation of a palindrome.
A palindrome is a string that reads the same backwards and forwards:
- dad
- mom
- ...

For our check, we ignore letter casing, whitespace, and only consider alphanumeric characters.

File: [src/main/kotlin/exercise/PalindromePermutationChecker.kt](./src/main/kotlin/exercise/PalindromePermutationChecker.kt)

Tests: [src/test/kotlin/exercise/PalindromePermutationCheckerTest.kt](./src/test/kotlin/exercise/PalindromePermutationCheckerTest.kt)

### 5. Matrix rotation

Write a method for rotating a given $n \times n$ matrix by 90 degrees clock-wise.

File: [src/main/kotlin/exercise/MatrixRotation.kt](./src/main/kotlin/exercise/MatrixRotation.kt)

Tests: [src/test/kotlin/exercise/MatrixRotationTest.kt](./src/test/kotlin/exercise/MatrixRotationTest.kt)

### 6. String Distance Checker

Write a method that determines if the distance between two strings is at most 1.
Strings have distance 0 if they are identical.
They have distance 1 if

- one character was replaced,
- one character was added,
- or one character was removed.

File: [src/main/kotlin/exercise/StringDistanceChecker.kt](./src/main/kotlin/exercise/StringDistanceChecker.kt)

Tests: [src/test/kotlin/exercise/StringDistanceCheckerTest.kt](./src/test/kotlin/exercise/StringDistanceCheckerTest.kt)

### 7. Zero Matrix

Write a method that 

1. Sets each column value to zero if there was at least one zero value in the column
2. Sets each row value to zero if there was at least one zero value in the row

File: [src/main/kotlin/exercise/ZeroMatrix.kt](./src/main/kotlin/exercise/ZeroMatrix.kt)

Tests: [src/test/kotlin/exercise/ZeroMatrixTest.kt](./src/test/kotlin/exercise/ZeroMatrixTest.kt)

### 8. Birth-Rate Simulator

This exercise is about performing an empirical experiment.
Assume that a society adopted the following policy:
Each family has to get children until the first girl is born.

Question: What will be the resulting gender ratio?

File: [src/main/kotlin/exercise/BirthrateSimulator.kt](./src/main/kotlin/exercise/BirthRateSimulator.kt)

Experiments: [src/test/kotlin/exercise/BirthrateSimulatorTest.kt](./src/test/kotlin/exercise/BirthRateSimulatorTest.kt)
