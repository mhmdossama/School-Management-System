# School Management System in Java

This project implements a basic School Management System in Java. It tracks teachers, students, and the financial status of the school.

## Table of Contents

1. [Overview](#overview)
2. [Classes](#classes)
3. [Usage](#usage)
4. [OOP Concepts](#oop-concepts)

## Overview

The system includes three main classes:

- **School**: Manages lists of teachers and students, and keeps track of the school's finances.
- **Student**: Represents a student with attributes like ID, name, grade, and fees.
- **Teacher**: Represents a teacher with attributes like ID, name, and salary.

## Classes

### School

- Manages teachers and students.
- Tracks total money earned and spent.

### Student

- Represents student information such as ID, name, grade, and fees.
- Handles fee payments.

### Teacher

- Represents teacher information such as ID, name, and salary.
- Manages salary payments.

## Usage

1. Create instances of `Teacher` and `Student`.
2. Add them to lists.
3. Create an instance of `School` with these lists.
4. Update fees and salaries as needed.
5. Retrieve and display financial information.

## OOP Concepts

The system demonstrates several OOP concepts:

- **Encapsulation**: Data and methods are bundled together within classes.
- **Abstraction**: Classes represent real-world entities with simplified models.
- **Inheritance**: Could be used to create specialized classes (not used in this example).
- **Polymorphism**: Methods can be used in different contexts (e.g., `toString` method).
- **Composition**: The `School` class contains lists of `Teacher` and `Student` objects, showing a "has-a" relationship.
